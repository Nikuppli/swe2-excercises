package ch.juventus.collection;

import ch.juventus.object.Person;

import java.util.*;

public class CollectionsImplemented {

    public static void main(String[] args) {
        arrayList();
        //linkedList();
        //hashSet();
        //linkedHashSet();
        //treeSet();
        //queue();
        //hashMap();
        //linkedHashMap();
        //treeMap();
    }

    static void arrayList() {
        List<String> animals = new ArrayList<>();
        animals.add("Hund");
        animals.add("Katze");
        animals.add("Maus");
        animals.add("Vogel");
        animals.add("Elefant");
        System.out.println(animals.size());
        animals.add(2, "Tieger");
        System.out.println(animals);
        System.out.println(animals.contains("Katze"));
        animals.get(0);
        animals.remove(4);
        animals.remove("Hund");
        // animals.remove(20); -> java.lang.IndexOutOfBoundsException
        animals.remove("Kuh"); // Nichts passiert, kein Element wird gelöscht
        animals.forEach(animal -> System.out.println(animal));
        animals.clear();
    }

    static void linkedList() {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Hund");
        animals.add("Katze");
        animals.add("Maus");
        animals.add("Vogel");
        animals.add("Elefant");
        System.out.println(animals.size());
        animals.indexOf("Hund");
        animals.indexOf("Kuh"); // -> -1
        animals.get(2);
        System.out.println(animals.getFirst());
        System.out.println(animals.getLast());
        animals.removeFirst();
        animals.removeLast();
        System.out.println(animals);
        animals.forEach(animal -> System.out.println(animal));
    }

    static void hashSet() {
        Set<Person> people = new HashSet<>();
        Person peter = new Person("Peter", "Müller", 18, true);
        people.add(new Person("Linda", "Krüger", 18, true));
        people.add(new Person("Linda", "Krüger", 18, true));
        people.add(new Person("Hans", "Muster", 18, true));
        people.add(new Person("Vorname", "Nachname", 18, true));
        people.add(peter);
        System.out.println(people.isEmpty());
        System.out.println(people.size());
        System.out.println(people.contains(peter));
        people.remove(peter);
        System.out.println(people);
        people.forEach(person -> System.out.println(person));
    }

    static void linkedHashSet() {
        Set<Person> people = new LinkedHashSet<>();
        Person peter = new Person("Peter", "Müller", 18, true);
        people.add(new Person("Linda", "Krüger", 18, true));
        people.add(new Person("Linda", "Krüger", 18, true));
        people.add(new Person("Hans", "Muster", 18, true));
        people.add(new Person("Vorname", "Nachname", 18, true));
        people.add(peter);
        System.out.println(people.isEmpty());
        System.out.println(people.size());
        System.out.println(people);
        System.out.println(people);
        System.out.println(people); // Immer gleiche Reihenfolge
        people.forEach(person -> System.out.println(person));
    }

    static void treeSet() {
        Set<Person> people = new TreeSet<>(new PersonComperator());
        Person peter = new Person("Peter", "A", 18, true);
        people.add(new Person("Linda", "B", 18, true));
        people.add(new Person("Linda", "B", 18, true));
        people.add(new Person("Hans", "D", 18, true));
        people.add(new Person("Vorname", "C", 18, true));
        people.add(peter);
        System.out.println(people.size());
        System.out.println(people); // -> Sortiert
        people.forEach(person -> System.out.println(person));
    }

    static void queue() {
        Queue<Person> queue = new LinkedList();
        queue.add(new Person("Peter", "Meier", 18, true));
        queue.add(new Person("Linda", "Krüger", 18, true));
        queue.add(new Person("Hans", "Muster", 18, true));
        queue.add(new Person("Vorname", "Nachname", 18, true));
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        queue.forEach(person -> System.out.println(person));
    }

    static void hashMap() {
        Map<String, List<Person>> peopleMap = new HashMap<>();
        List<Person> family = new ArrayList<>();
        family.add(new Person("Schwester", "K", 18, true));
        family.add(new Person("Mutter", "K", 18, true));
        family.add(new Person("Vater", "K", 18, true));
        List<Person> friends = new ArrayList<>();
        friends.add(new Person("Natalie", "F", 18, true));
        friends.add(new Person("Simona", "F", 18, true));
        friends.add(new Person("Chantalle", "F", 18, true));
        peopleMap.put("family", family);
        peopleMap.put("office", null);
        peopleMap.put("friends", friends);
        System.out.println(peopleMap);
        List<Person> office = new ArrayList<>();
        office.add(new Person("Jose", "O", 18, true));
        office.add(new Person("Stephen", "O", 18, true));
        peopleMap.put("office", office);
        System.out.println(peopleMap.entrySet());
        System.out.println(peopleMap.keySet());
        System.out.println(peopleMap.values());
        peopleMap.forEach((category, people) -> {
            System.out.println(category + ":");
            people.forEach(person -> {
                System.out.println(person.getFirstName() + " " + person.getLastName());
            });
        });
    }

    static void linkedHashMap() {
        Map<Integer, Person> peopleMap = new LinkedHashMap<>(10,0.75f,true);
        peopleMap.put(0, new Person("Peter", "Meier", 18, true));
        peopleMap.put(1, new Person("Linda", "Krüger", 18, true));
        peopleMap.put(2, new Person("Linda", "Krüger", 18, true));
        peopleMap.put(3, new Person("Hans", "Muster", 18, true));
        peopleMap.put(4, new Person("Vorname", "Nachname", 18, true));
        System.out.println(peopleMap);
        peopleMap.get(0);
        peopleMap.get(3);
        System.out.println(peopleMap);
        peopleMap.forEach((index, person) -> System.out.println(index + ": " + person.getFirstName() + " " + person.getLastName()));
    }

    static void treeMap() {
        Map<Integer, Person> peopleMap = new TreeMap<>();
        peopleMap.put(2, new Person("Peter", "Meier", 18, true));
        peopleMap.put(0, new Person("Linda", "Krüger", 18, true));
        peopleMap.put(1, new Person("Linda", "Krüger", 18, true));
        peopleMap.put(4, new Person("Hans", "Muster", 18, true));
        peopleMap.put(3, new Person("Vorname", "Nachname", 18, true));
        System.out.println(peopleMap); // nach keys sortiert
        peopleMap.forEach((index, person) -> System.out.println(index + ": " + person.getFirstName() + " " + person.getLastName()));
    }

}