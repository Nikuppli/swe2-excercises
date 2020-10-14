package ch.juventus.collection;

import ch.juventus.object.Person;

import java.sql.SQLOutput;
import java.util.*;

public class Collections {

    public static void main(String[] args) {
        arrayList();
        linkedList();
        hashSet();
        linkedHashSet();
        treeSet();
        queue();
        hashMap();
        linkedHashMap();
        treeMap();
    }

    static void arrayList() {
        // TODO: Erstelle eine ArrayList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
        List<String> tiere = new ArrayList<>();
        tiere.add("Hund");
        tiere.add("Elefant");
        tiere.add("Fledermaus");
        tiere.add("Maus");
        tiere.add("Katze");


        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
        System.out.println(tiere.size());
        // TODO: Füge ein weiteres Element mit Index 2 hinzu.


        tiere.add(2,"Vogel");
        // TODO: Gib die ganze Liste auf der Konsole aus.
        System.out.println(tiere);

        // TODO: Prüfe ob ein bestimmtes Element in der Liste vorkommt.
        if(tiere.contains("Hund")){
            System.out.println("exist");
        }

        System.out.println(tiere.get(2));

        tiere.remove(1);
        tiere.remove("Hund");
        tiere.remove(99);
        tiere.remove("a");
        tiere.clear();

        // TODO: Ein Element lesen via Index.
        // TODO: Ein Element löschen via Index
        // TODO: Ein Element löschen via String
        // TODO: Ein Element löschen via Index, das es nicht gibt (was passiert?)
        // TODO: Ein Element löschen via String, das es nicht gibt (was passiert?)
        // TODO: Alle Elemente aus der Liste löschen
    }

    static void linkedList() {
        // TODO: Erstelle eine LinkedList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
        // TODO: Den Index eines bestimmten Elements finden
        // TODO: Den Index eines Elements das nicht existiert finden (was passiert?)
        // TODO: Ein Element via Index lesen
        // TODO: Das erste und letzte Element der Liste ausgeben
        // TODO: Das erste und letzte Element der Liste löschen
    }









    static void hashSet() {
        Set<Person> persons = new HashSet<>();
        persons.add(new Person("Yanik", "Schuppli", 18, true));
        persons.add(new Person("Mike", "Schuppli", 18, true));
        persons.add(new Person("Mariono", "Schuppli", 18, true));
        persons.add(new Person("Robin", "Schuppli", 18, true));
        persons.add(new Person("Philipp", "Schuppli", 18, true));
        // TODO: Erstelle ein HashSet von Personen (object package)
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        // TODO: Prüfe, ob das Set nicht leer ist
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        // TODO: Prüfe, ob ein gewisses Element im Set existiert
        // TODO: Lösche ein bestimmtes Element aus dem Set
    }

    static void linkedHashSet() {
        // TODO: Erstelle ein LinkedHashSet von Personen (object package)
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        // TODO: Prüfe, ob das Set nicht leer ist
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        // TODO: Gib das gesamte Set mehrmals auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
    }

    static void treeSet() {
        // TODO: Erstelle ein TreeSet von Personen (object package) und verwende den PersonComperator
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        // TODO: Gib das gesamte Set auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
    }

    static void queue() {
        // TODO: Erstelle ein Queue von Personen (object package) mit einer LinkedList
        // TODO: Füge mehrere Personen ein
        // TODO: Lies das Head-Element, ohne es zu entfernen
        // TODO: Lies und entferne das Head-Element
    }

    static void hashMap() {
        // TODO: Erstelle eine HashMap (Key: String; Value: List<Person>)
        Map<String,List<Person>> persons = new HashMap<>();
        List<Person> arrPersons = new ArrayList<>();
        arrPersons.add(new Person("Yanik", "Schuppli", 18, true));
        arrPersons.add(new Person("Mike", "Schuppli", 18, true));
        arrPersons.add(new Person("Mariono", "Schuppli", 18, true));
        arrPersons.add(new Person("Robin", "Schuppli", 18, true));
        // TODO: Füge folgende Einträge in die Map:
        //  ­ "family" : Liste von 3 Personen
        //  ­ "office" : null
        //  ­ "friends" : Liste von 3 Personen

        List<Person> friends = new ArrayList<>();

        friends.add(new Person("Hund", "Schuppli", 18, true));
        friends.add(new Person("Wal", "Schuppli", 18, true));
        friends.add(new Person("Katze", "Schuppli", 18, true));
        // TODO: Gib die gesamte Map auf der Konsole aus
        // TODO: Füge einen weiteren Eintrag "office" : Liste von 2 Personen der Map hinzu.
        //  (Wieviele Einträge sind jetzt in der Map?)
        // TODO: Gib das entrySet auf der Konsole aus
        // TODO: Gib das keySet auf der Konsole aus
        // TODO: Gib die values auf der Konsole aus
    }

    static void linkedHashMap() {
        // TODO: Erstelle eine LinkedHashMap (Key: Integer; Value: Person) mit Access-Order
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        // TODO: Gib die gesamte Map auf der Konsole aus
        // TODO: Greife auf mehrere Elemente zu
        // TODO: Gib die Map erneut aus und überprüfe die Sortierung
    }

    static void treeMap() {
        // TODO: Erstelle eine TreeMap (Key: Integer; Value: Person)
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        // TODO: Gib die gesamte Map auf der Konsole aus und überprüfe die Sortierung
    }

}