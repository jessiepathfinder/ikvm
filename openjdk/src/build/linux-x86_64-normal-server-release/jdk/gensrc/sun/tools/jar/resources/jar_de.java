package sun.tools.jar.resources;

import java.util.ListResourceBundle;

public final class jar_de extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "error.bad.cflag", "Kennzeichen \"c\" erfordert Angabe von Manifest oder Eingabedateien." },
            { "error.bad.eflag", "Kennzeichen \"e\" und Manifest mit dem Attribut \"Main-Class\" k\u00F6nnen nicht zusammen angegeben\nwerden." },
            { "error.bad.option", "Eine der Optionen -{ctxu} muss angegeben werden." },
            { "error.bad.uflag", "Kennzeichen \"u\" erfordert Angabe von Manifest, Kennzeichen \"e\" oder Eingabedateien." },
            { "error.cant.open", "\u00D6ffnen nicht m\u00F6glich: {0} " },
            { "error.create.dir", "{0}: Verzeichnis konnte nicht erstellt werden" },
            { "error.create.tempfile", "Es konnte keine tempor\u00E4re Datei erstellt werden" },
            { "error.illegal.option", "Ung\u00FCltige Option: {0}" },
            { "error.incorrect.length", "Falsche L\u00E4nge bei der Verarbeitung: {0}" },
            { "error.nosuch.fileordir", "{0}: Datei oder Verzeichnis nicht vorhanden" },
            { "error.write.file", "Fehler beim Schreiben in vorhandener JAR-Datei" },
            { "out.added.manifest", "Manifest wurde hinzugef\u00FCgt" },
            { "out.adding", "{0} wird hinzugef\u00FCgt" },
            { "out.create", "  erstellt: {0}" },
            { "out.deflated", "({0} % verkleinert)" },
            { "out.extracted", "extrahiert: {0}" },
            { "out.ignore.entry", "Eintrag {0} wird ignoriert" },
            { "out.inflated", " vergr\u00F6\u00DFert: {0}" },
            { "out.size", "(ein = {0}) (aus = {1})" },
            { "out.stored", "(0 % gespeichert)" },
            { "out.update.manifest", "Manifest wurde aktualisiert" },
            { "usage", "Verwendung: jar {ctxui}[vfmn0Me] [jar-file] [manifest-file] [entry-point] [-C dir] Dateien ...\nOptionen:\n    -c  Neues Archiv erstellen\n    -t  Inhaltsverzeichnis f\u00FCr Archiv anzeigen\n    -x  Benannte (oder alle) Dateien aus dem Archiv extrahieren\n    -u  Vorhandenes Archiv aktualisieren\n    -v  Ausgabe im Verbose-Modus aus Standard-Ausgabe generieren\n    -f  Dateinamen f\u00FCr Archiv angeben\n    -m  Manifest-Informationen aus angegebener Manifest-Datei einschlie\u00DFen\n    -n  Pack200-Normalisierung nach Erstellung eines neuen Archivs ausf\u00FChren\n    -e  Anwendungs-Einstiegspunkt f\u00FCr alleinstehende Anwendung angeben\n        in einer ausf\u00FChrbaren JAR-Datei geb\u00FCndelt\n    -0  nur speichern; keine ZIP-Komprimierung verwenden\n    -M  keine Manifest-Datei f\u00FCr die Eintr\u00E4ge erstellen\n    -i  Index-Informationen f\u00FCr die angegebenen JAR-Dateien generieren\n    -C  zu angegebenem Verzeichnis wechseln und die folgende Datei einschlie\u00DFen\nDateien, die Verzeichnisse sind, werden rekursiv verarbeitet.\nDie Namen der Manifest-Datei, der Archiv-Datei und des Einstiegspunkts sind\nin derselben Reihenfolge wie die Kennzeichen f\u00FCr \"m\", \"f\" und \"e\" angegeben.\n\nBeispiel 1: Archivieren von zwei Klassendateien in einem Archiv mit dem Namen \"classes.jar\": \n       jar cvf classes.jar Foo.class Bar.class \nBeispiel 2: Verwenden einer vorhandenen Manifest-Datei mit dem Namen \"mymanifest\" und Archivieren aller\n           Dateien im Verzeichnis mit dem Namen \"foo/\" in die Archiv-Datei \"classes.jar\": \n       jar cvfm classes.jar mymanifest -C foo/ .\n" },
        };
    }
}
