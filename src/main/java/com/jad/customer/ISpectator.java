package com.jad.customer;

import com.jad.show.IShow;
import com.jad.show.MovieShow;
import com.jad.show.Show;
import com.jad.show.StreetShow;

public interface ISpectator {
    String getFirstName();

    String getLastName();

    void watch(IShow show);
    void watch(MovieShow show);
}
