package com.drisko.dumi.util;

import com.drisko.dumi.model.Prefix;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomPrefixPickerUtil {

    private static Random randomGenerator = new Random();
    private static Set<Prefix> prefixIds = new HashSet<>(3);

    public static Set<Prefix> getRandomIds(List<Prefix> ids) {
        if (prefixIds.size() != 0) {
            prefixIds.clear();
        }

        int index = 0;

        while (prefixIds.size() < 3) {
            index = randomGenerator.nextInt(ids.size());
            prefixIds.add(ids.get(index));
        }

        return prefixIds;
    }
}
