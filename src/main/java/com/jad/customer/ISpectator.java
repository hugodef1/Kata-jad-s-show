package com.jad.customer;

import com.jad.show.IShow;
import com.jad.show.MovieShow;
import com.jad.show.TheaterShow;



public interface ISpectator {
    String getFirstName();

    String getLastName();

    void watch(IShow show);
    void watch(final TheaterShow show);
    void watch(MovieShow show);

}
