package com.amarinag.demo1;

interface Event {
    void matchCenter();
    String matchName();
}

class EventImpl implements Event {
    @Override
    public void matchCenter() {

    }

    @Override
    public String matchName() {
        return null;
    }
}


public class Anon {

    private String name;
    private String lastName;
    private Event event;

    public Anon(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }


}

class RunnerDadu {
    public static void main(String[] args) {
        String carlitos = "Carlitos";
        Anon anon = new Anon("name", "lastName");
        anon.setEvent(new Event() {
            @Override
            public void matchCenter() {
            }

            @Override
            public String matchName() {
                return carlitos;
            }
        });
    }
}