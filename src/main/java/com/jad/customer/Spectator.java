package com.jad.customer;

import com.jad.show.IShow;
import com.jad.show.MovieShow;

public class Spectator implements ISpectator {
    private final String firstName;
    private final String lastName;

    public Spectator(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void watch(final IShow show) {
        show.watchedBy(this);
    }

    @Override
    public void watch(final MovieShow show) {
        System.out.println("J'ai assisté au film " + show.getName() + " de " + show.getDirector() + " sorti en " + show.getYearOfRelease());
    }

}
