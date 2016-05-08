
package com.wandrell.tabletop.pendragon.model.character.relationship;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.character.Character;

public interface CharacterRelationships {

    public void addFollower(final Follower follower);

    public void addWife(final Wife wife);

    public void clearFollowers();

    public void clearWives();

    public Character getCharacter();

    public Collection<Follower> getFollowers();

    public Collection<Wife> getWives();

    public void removeFollower(final Follower follower);

    public void removeWife(final Wife wife);

}
