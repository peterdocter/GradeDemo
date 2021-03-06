package com.feizhu.dubgrade;

/**
 * Created by zhouhl on 2016/12/2.
 * 默认标点符号格式化
 */

public class DefaultPunctuationFormat implements WordFormat {

    private static final char CN[] = {'，', '。', '：', '！', '“', '”', '‘', '’', '？', '（', '）', '、'};
    private static final char EN[] = {',', '.', ':', '!', '"', '"', '\'', '\'', '?', '(', ')', '/'};

    @Override
    public String format(String text) {
        if (text != null && !text.isEmpty()) {
            for (int i=0; i < CN.length; i++) {
                text = text.replace(CN[i], EN[i]);
            }
        }

        return text;
    }
}
