package com.jad.show;

import com.jad.customer.ISpectator;

public interface IShow {
    String getName();
    String getDescription();
    ShowType getShowType();
    void watchBy(final ISpectator spec);
}
