package com.drisko.dumi.service.prefix;

import com.drisko.dumi.model.Prefix;
import com.drisko.dumi.repository.PrefixRepository;
import com.drisko.dumi.repository.WordRepository;
import com.drisko.dumi.util.RandomPrefixPickerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PrefixServiceImpl implements PrefixService {

    private final PrefixRepository prefixRepository;
    private final WordRepository wordRepository;

    @Autowired
    public PrefixServiceImpl(PrefixRepository prefixRepository, WordRepository wordRepository) {
        this.prefixRepository = prefixRepository;
        this.wordRepository = wordRepository;
    }

    @Override
    public Set<Prefix> getLevelsData() {
        Set<Prefix> randomPrefixes = get3RandomPrefixes();

        for (Prefix prefix : randomPrefixes) {
            prefix.setWords(wordRepository.findAllByPrefixId(prefix.getId()));
        }

        return randomPrefixes;
    }

    @Override
    public Set<Prefix> get3RandomPrefixes() {
        return RandomPrefixPickerUtil.getRandomIds(prefixRepository.findAll());
    }
}
