package com.drisko.dumi.service.word;

import com.drisko.dumi.model.Prefix;
import com.drisko.dumi.model.Word;

import java.util.List;
import java.util.Map;

public interface WordService {

    List<Word> getAll();

    List<Word> getAllByPrefixId(int id);

    Map<Prefix,List<Word>> loadLevels();
}
