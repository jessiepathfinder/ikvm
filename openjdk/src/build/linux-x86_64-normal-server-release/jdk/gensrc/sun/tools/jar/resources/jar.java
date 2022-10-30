package sun.tools.jar.resources;

import java.util.ListResourceBundle;

public final class jar extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "error.bad.cflag", "'c' flag requires manifest or input files to be specified!" },
            { "error.bad.eflag", "'e' flag and manifest with the 'Main-Class' attribute cannot be specified \ntogether!" },
            { "error.bad.option", "One of options -{ctxu} must be specified." },
            { "error.bad.uflag", "'u' flag requires manifest, 'e' flag or input files to be specified!" },
            { "error.cant.open", "can''t open: {0} " },
            { "error.create.dir", "{0} : could not create directory" },
            { "error.create.tempfile", "Could not create a temporary file" },
            { "error.illegal.option", "Illegal option: {0}" },
            { "error.incorrect.length", "incorrect length while processing: {0}" },
            { "error.nosuch.fileordir", "{0} : no such file or directory" },
            { "error.write.file", "Error in writing existing jar file" },
            { "out.added.manifest", "added manifest" },
            { "out.adding", "adding: {0}" },
            { "out.create", "  created: {0}" },
            { "out.deflated", "(deflated {0}%)" },
            { "out.extracted", "extracted: {0}" },
            { "out.ignore.entry", "ignoring entry {0}" },
            { "out.inflated", " inflated: {0}" },
            { "out.size", "(in = {0}) (out= {1})" },
            { "out.stored", "(stored 0%)" },
            { "out.update.manifest", "updated manifest" },
            { "usage", "Usage: jar {ctxui}[vfmn0PMe] [jar-file] [manifest-file] [entry-point] [-C dir] files ...\nOptions:\n    -c  create new archive\n    -t  list table of contents for archive\n    -x  extract named (or all) files from archive\n    -u  update existing archive\n    -v  generate verbose output on standard output\n    -f  specify archive file name\n    -m  include manifest information from specified manifest file\n    -n  perform Pack200 normalization after creating a new archive\n    -e  specify application entry point for stand-alone application \n        bundled into an executable jar file\n    -0  store only; use no ZIP compression\n    -P  preserve leading '/' (absolute path) and \"..\" (parent directory) components from file names\n    -M  do not create a manifest file for the entries\n    -i  generate index information for the specified jar files\n    -C  change to the specified directory and include the following file\nIf any file is a directory then it is processed recursively.\nThe manifest file name, the archive file name and the entry point name are\nspecified in the same order as the 'm', 'f' and 'e' flags.\n\nExample 1: to archive two class files into an archive called classes.jar: \n       jar cvf classes.jar Foo.class Bar.class \nExample 2: use an existing manifest file 'mymanifest' and archive all the\n           files in the foo/ directory into 'classes.jar': \n       jar cvfm classes.jar mymanifest -C foo/ .\n" },
        };
    }
}
