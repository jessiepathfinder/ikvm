/*
  Copyright (C) 2007-2015 Jeroen Frijters

  This software is provided 'as-is', without any express or implied
  warranty.  In no event will the authors be held liable for any damages
  arising from the use of this software.

  Permission is granted to anyone to use this software for any purpose,
  including commercial applications, and to alter it and redistribute it
  freely, subject to the following restrictions:

  1. The origin of this software must not be misrepresented; you must not
     claim that you wrote the original software. If you use this software
     in a product, an acknowledgment in the product documentation would be
     appreciated but is not required.
  2. Altered source versions must be plainly marked as such, and must not be
     misrepresented as being the original software.
  3. This notice may not be removed or altered from any source distribution.

  Jeroen Frijters
  jeroen@frijters.net
  
*/
using System;
using System.Collections.Generic;
using System.Net;
using System.Net.NetworkInformation;
using System.Net.Sockets;
using System.Security;

//We are unable to implement those in ikNative due to GCC bug
//But no problem! We can implement those in C# JNI
//Since those don't touch file descriptors, they are purr-fectly safe
//To implement like this

public static class Java_java_net_Inet4AddressImpl
{

	public static bool isReachable0(object thisInet4AddressImpl, byte[] addr, int timeout, byte[] ifaddr, int ttl)
	{
		// like the JDK, we don't use Ping, but we try a TCP connection to the echo port
		// (.NET 2.0 has a System.Net.NetworkInformation.Ping class, but that doesn't provide the option of binding to a specific interface)
		try
		{
			using (Socket sock = new Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp))
			{
				if (ifaddr != null)
				{
					sock.Bind(new IPEndPoint(((ifaddr[3] << 24) + (ifaddr[2] << 16) + (ifaddr[1] << 8) + ifaddr[0]) & 0xFFFFFFFFL, 0));
				}
				if (ttl > 0)
				{
					sock.SetSocketOption(SocketOptionLevel.IP, SocketOptionName.IpTimeToLive, ttl);
				}
				IPEndPoint ep = new IPEndPoint(((addr[3] << 24) + (addr[2] << 16) + (addr[1] << 8) + addr[0]) & 0xFFFFFFFFL, 7);
				IAsyncResult res = sock.BeginConnect(ep, null, null);
				if (res.AsyncWaitHandle.WaitOne(timeout, false))
				{
					try
					{
						sock.EndConnect(res);
						return true;
					}
					catch (SocketException x)
					{
						const int WSAECONNREFUSED = 10061;
						if (x.ErrorCode == WSAECONNREFUSED)
						{
							// we got back an explicit "connection refused", that means the host was reachable.
							return true;
						}
					}
				}
			}
		}
		catch (SocketException)
		{
		}
		return false;
	}
}

public static class Java_java_net_Inet6Address
{
	public static void init()
	{
	}
}

public static class Java_java_net_Inet6AddressImpl
{
	public static bool isReachable0(object thisInet6AddressImpl, byte[] addr, int scope, int timeout, byte[] inf, int ttl, int if_scope)
	{
		if (addr.Length == 4)
		{
			return Java_java_net_Inet4AddressImpl.isReachable0(null, addr, timeout, inf, ttl);
		}
		// like the JDK, we don't use Ping, but we try a TCP connection to the echo port
		// (.NET 2.0 has a System.Net.NetworkInformation.Ping class, but that doesn't provide the option of binding to a specific interface)
		try
		{
			using (Socket sock = new Socket(AddressFamily.InterNetworkV6, SocketType.Stream, ProtocolType.Tcp))
			{
				if (inf != null)
				{
					sock.Bind(new IPEndPoint(new IPAddress(inf, (uint)if_scope), 0));
				}
				if (ttl > 0)
				{
					sock.SetSocketOption(SocketOptionLevel.IPv6, SocketOptionName.HopLimit, ttl);
				}
				IPEndPoint ep = new IPEndPoint(new IPAddress(addr, (uint)scope), 7);
				IAsyncResult res = sock.BeginConnect(ep, null, null);
				if (res.AsyncWaitHandle.WaitOne(timeout, false))
				{
					try
					{
						sock.EndConnect(res);
						return true;
					}
					catch (SocketException x)
					{
						const int WSAECONNREFUSED = 10061;
						if (x.ErrorCode == WSAECONNREFUSED)
						{
							// we got back an explicit "connection refused", that means the host was reachable.
							return true;
						}
					}
				}
			}
		}
		catch (ArgumentException)
		{
		}
		catch (SocketException)
		{
		}
		return false;
	}
}