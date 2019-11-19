package com.drisko.dumi.service.word;

import com.drisko.dumi.model.Prefix;
import com.drisko.dumi.model.Word;
import com.drisko.dumi.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class WordServiceImpl implements WordService {

    private final WordRepository wordRepository;

    @Autowired
    public WordServiceImpl(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @Override
    public List<Word> getAll() {
        return wordRepository.findAll();
    }

    @Override
    public List<Word> getAllByPrefixId(int rootId) {
        return wordRepository.findAllByPrefixId(rootId);
    }

    @Override
    public Map<Prefix, List<Word>> loadLevels() {
        Map<Prefix, List<Word>> levels = new HashMap<>();
        Random random = new Random();

//        int index = random.nextInt();

        return levels;
    }
}
