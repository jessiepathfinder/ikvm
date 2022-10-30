package sun.tools.jar.resources;

import java.util.ListResourceBundle;

public final class jar_sv extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "error.bad.cflag", "f\u00F6r c-flaggan m\u00E5ste manifest- eller indatafiler anges." },
            { "error.bad.eflag", "e-flaggan och manifest med attributet Main-Class kan inte anges \ntillsammans." },
            { "error.bad.option", "Ett av alternativen -{ctxu} m\u00E5ste anges." },
            { "error.bad.uflag", "f\u00F6r u-flaggan m\u00E5ste manifest-, e-flagg- eller indatafiler anges." },
            { "error.cant.open", "kan inte \u00F6ppna: {0} " },
            { "error.create.dir", "{0} : kunde inte skapa n\u00E5gon katalog" },
            { "error.create.tempfile", "Kunde inte skapa en tillf\u00E4llig fil" },
            { "error.illegal.option", "Otill\u00E5tet alternativ: {0}" },
            { "error.incorrect.length", "ogiltig l\u00E4ngd vid bearbetning: {0}" },
            { "error.nosuch.fileordir", "{0} : det finns ingen s\u00E5dan fil eller katalog" },
            { "error.write.file", "Det uppstod ett fel vid skrivning till befintlig jar-fil." },
            { "out.added.manifest", "tillagt manifestfil" },
            { "out.adding", "l\u00E4gger till: {0}" },
            { "out.create", "  skapad: {0}" },
            { "out.deflated", "({0}% packat)" },
            { "out.extracted", "extraherat: {0}" },
            { "out.ignore.entry", "ignorerar posten {0}" },
            { "out.inflated", " uppackat: {0}" },
            { "out.size", "(in = {0}) (ut = {1})" },
            { "out.stored", "(0% lagrat)" },
            { "out.update.manifest", "uppdaterat manifest" },
            { "usage", "Syntax: jar {ctxui}[vfmn0Me] [jar-fil] [manifestfil] [startpunkt] [-C katalog] filer ...\nAlternativ:\n    -c  skapa nytt arkiv\n    -t  lista inneh\u00E5llsf\u00F6rteckning f\u00F6r arkiv\n    -x  extrahera namngivna (eller alla) filer fr\u00E5n arkiv\n    -u  uppdatera befintligt arkiv\n    -v  generera utf\u00F6rliga utdata vid standardutmatning\n    -f  ange arkivfilens namn\n    -m  inkludera manifestinformation fr\u00E5n angivet manifest\n    -n  utf\u00F6r Pack200-normalisering efter att ha skapat ett nytt arkiv\n    -e  ange programstartpunkt f\u00F6r frist\u00E5ende applikation \n        som medf\u00F6ljer i en jar-programfil\n    -0  endast lagra  (ingen zip-komprimering)\n    -M  skapa inte n\u00E5gon manifestfil f\u00F6r posterna\n    -i  generera indexinformation f\u00F6r de angivna jar-filerna\n    -C  \u00E4ndra till den angivna katalogen och inkludera f\u00F6ljande fil\nOm en fil \u00E4r en katalog bearbetas den rekursivt.\nNamnen p\u00E5 manifestfilen, arkivfilen och startpunkten anges\ni samma ordning som m-, f- och e-flaggorna.\n\nExempel 1: S\u00E5 h\u00E4r arkiverar du tv\u00E5 klassfiler i ett arkiv med namnet classes.jar: \n       jar cvf classes.jar Foo.class Bar.class \nExempel 2: Anv\u00E4nd en befintlig manifestfil (mymanifest) och arkivera alla\n           filer fr\u00E5n katalogen foo/ i classes.jar: \n       jar cvfm classes.jar mymanifest -C foo/ .\n" },
        };
    }
}
