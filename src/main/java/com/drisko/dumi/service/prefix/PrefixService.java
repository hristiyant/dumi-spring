package com.drisko.dumi.service.prefix;

import com.drisko.dumi.model.Prefix;
import com.drisko.dumi.model.Word;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface PrefixService {

    Set<Prefix> get3RandomPrefixes();
    Set<Prefix> getLevelsData();
}
