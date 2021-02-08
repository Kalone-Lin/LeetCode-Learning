package hard;

import java.util.List;

/**
 * 给定一个字符串 s 和一些长度相同的单词 words。找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置。
 * 注意子串要与 words 中的单词完全匹配，中间不能有其他字符，但不需要考虑 words 中单词串联的顺序。
 *
 * @author shelin 2021/01/20 14:36
 */
public class SubstringConcatenationWords {

    public static void main(String[] args) {

    }

    public static List<Integer> findSubstring(String s, String[] words) {
        for (int i = 0; i < s.toCharArray().length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (s.startsWith(words[j])) {

                }
            }
        }


        return null;
    }

}
