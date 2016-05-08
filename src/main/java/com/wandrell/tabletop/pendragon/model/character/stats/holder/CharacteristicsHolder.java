
package com.wandrell.tabletop.pendragon.model.character.stats.holder;

import java.util.Collection;

public interface CharacteristicsHolder<V> {

    public void add(final V skill);

    public void clear();

    public Collection<V> getAll();

    public void remove(final V skill);

    public void set(final Collection<V> skills);

}
