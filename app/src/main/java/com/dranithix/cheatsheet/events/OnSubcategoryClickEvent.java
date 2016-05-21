package com.dranithix.cheatsheet.events;

import com.dranithix.cheatsheet.entities.Category;
import com.dranithix.cheatsheet.entities.Subcategory;

/**
 * Created by user on 5/21/2016.
 */

public class OnSubcategoryClickEvent {
    public final Subcategory category;

    public OnSubcategoryClickEvent(Subcategory category) {
        this.category = category;
    }
}
