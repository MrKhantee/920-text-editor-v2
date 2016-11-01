/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jecelyin.editor.v2.highlight.lang;

import com.jecelyin.editor.v2.highlight.LangDefine;

/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class DartLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"/*\",\"NAME\":\"commentStart\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"*/\",\"NAME\":\"commentEnd\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"//\",\"NAME\":\"lineComment\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\",+-=<>/?^&*\",\"NAME\":\"wordBreakChars\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"{[\",\"NAME\":\"indentOpenBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"]}\",\"NAME\":\"indentCloseBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"(\",\"NAME\":\"unalignedOpenBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\")\",\"NAME\":\"unalignedCloseBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\\\\s*(((if|while)\\\\s*\\\\(|else\\\\s*|else\\\\s+if\\\\s*\\\\(|for\\\\s*\\\\(.*\\\\))[^{;]*)\",\"NAME\":\"indentNextLine\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"^.*(default:\\\\s*|case.*:.*)$\",\"NAME\":\"unindentThisLine\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\":\",\"NAME\":\"electricKeys\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"DART_LITERAL1\",\"DEFAULT\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"DELEGATE\":\"DART_EXPRESSION\",\"HASH_CHAR\":\"$\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\\$\\\\{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\$[_a-zA-Z][_a-zA-Z0-9]*\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"HASH_CHAR\":\"$\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"DART_EXPRESSION\",\"HIGHLIGHT_DIGITS\":\"TRUE\",\"DIGIT_RE\":\"(0x[\\\\p{XDigit}]+[lL]?|[\\\\p{Digit}]+(e[\\\\p{Digit}]*)?[lLdDfF]?)\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT3\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/**\"},{\"tag\":\"END\",\"text\":\"*/\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/*\"},{\"tag\":\"END\",\"text\":\"*/\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"@\\\"\\\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\\\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"@'''\"},{\"tag\":\"END\",\"text\":\"'''\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"@\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"@'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"DART_LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\\\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\\\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"DART_LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'''\"},{\"tag\":\"END\",\"text\":\"'''\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"DART_LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"DART_LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"!\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"-\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"%\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"&\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"|\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"^\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">>>\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">>\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"~/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\".\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\";\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"]\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"[\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"}\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"{\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\"(\",\"attrs\":{\"TYPE\":\"FUNCTION\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\")\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"LITERAL2\",\"text\":\"null\"},{\"tag\":\"LITERAL2\",\"text\":\"true\"},{\"tag\":\"LITERAL2\",\"text\":\"false\"},{\"tag\":\"KEYWORD3\",\"text\":\"bool\"},{\"tag\":\"KEYWORD3\",\"text\":\"int\"},{\"tag\":\"KEYWORD3\",\"text\":\"double\"},{\"tag\":\"KEYWORD3\",\"text\":\"num\"},{\"tag\":\"KEYWORD3\",\"text\":\"void\"},{\"tag\":\"KEYWORD4\",\"text\":\"AssertionError\"},{\"tag\":\"KEYWORD4\",\"text\":\"Clock\"},{\"tag\":\"KEYWORD4\",\"text\":\"Collection\"},{\"tag\":\"KEYWORD4\",\"text\":\"Comparable\"},{\"tag\":\"KEYWORD4\",\"text\":\"Date\"},{\"tag\":\"KEYWORD4\",\"text\":\"Dispatcher\"},{\"tag\":\"KEYWORD4\",\"text\":\"Duration\"},{\"tag\":\"KEYWORD4\",\"text\":\"Expect\"},{\"tag\":\"KEYWORD4\",\"text\":\"FallThroughError\"},{\"tag\":\"KEYWORD4\",\"text\":\"Function\"},{\"tag\":\"KEYWORD4\",\"text\":\"HashMap\"},{\"tag\":\"KEYWORD4\",\"text\":\"HashSet\"},{\"tag\":\"KEYWORD4\",\"text\":\"Hashable\"},{\"tag\":\"KEYWORD4\",\"text\":\"Isolate\"},{\"tag\":\"KEYWORD4\",\"text\":\"Iterable\"},{\"tag\":\"KEYWORD4\",\"text\":\"Iterator\"},{\"tag\":\"KEYWORD4\",\"text\":\"LinkedHashMap\"},{\"tag\":\"KEYWORD4\",\"text\":\"List\"},{\"tag\":\"KEYWORD4\",\"text\":\"Map\"},{\"tag\":\"KEYWORD4\",\"text\":\"Match\"},{\"tag\":\"KEYWORD4\",\"text\":\"Math\"},{\"tag\":\"KEYWORD4\",\"text\":\"Object\"},{\"tag\":\"KEYWORD4\",\"text\":\"Pattern\"},{\"tag\":\"KEYWORD4\",\"text\":\"Promise\"},{\"tag\":\"KEYWORD4\",\"text\":\"Proxy\"},{\"tag\":\"KEYWORD4\",\"text\":\"Queue\"},{\"tag\":\"KEYWORD4\",\"text\":\"ReceivePort\"},{\"tag\":\"KEYWORD4\",\"text\":\"RegExp\"},{\"tag\":\"KEYWORD4\",\"text\":\"SendPort\"},{\"tag\":\"KEYWORD4\",\"text\":\"Set\"},{\"tag\":\"KEYWORD4\",\"text\":\"StopWatch\"},{\"tag\":\"KEYWORD4\",\"text\":\"String\"},{\"tag\":\"KEYWORD4\",\"text\":\"StringBuffer\"},{\"tag\":\"KEYWORD4\",\"text\":\"Strings\"},{\"tag\":\"KEYWORD4\",\"text\":\"TimeZone\"},{\"tag\":\"KEYWORD4\",\"text\":\"TypeError\"},{\"tag\":\"KEYWORD4\",\"text\":\"BadNumberFormatException\"},{\"tag\":\"KEYWORD4\",\"text\":\"ClosureArgumentMismatchException\"},{\"tag\":\"KEYWORD4\",\"text\":\"EmptyQueueException\"},{\"tag\":\"KEYWORD4\",\"text\":\"Exception\"},{\"tag\":\"KEYWORD4\",\"text\":\"ExpectException\"},{\"tag\":\"KEYWORD4\",\"text\":\"IllegalAccessException\"},{\"tag\":\"KEYWORD4\",\"text\":\"IllegalArgumentException\"},{\"tag\":\"KEYWORD4\",\"text\":\"IllegalJSRegExpException\"},{\"tag\":\"KEYWORD4\",\"text\":\"IndexOutOfRangeException\"},{\"tag\":\"KEYWORD4\",\"text\":\"IntegerDivisionByZeroException\"},{\"tag\":\"KEYWORD4\",\"text\":\"NoMoreElementsException\"},{\"tag\":\"KEYWORD4\",\"text\":\"NoSuchMethodException\"},{\"tag\":\"KEYWORD4\",\"text\":\"NotImplementedException\"},{\"tag\":\"KEYWORD4\",\"text\":\"NullPointerException\"},{\"tag\":\"KEYWORD4\",\"text\":\"ObjectNotClosureException\"},{\"tag\":\"KEYWORD4\",\"text\":\"OutOfMemoryException\"},{\"tag\":\"KEYWORD4\",\"text\":\"StackOverflowException\"},{\"tag\":\"KEYWORD4\",\"text\":\"UnsupportedOperationException\"},{\"tag\":\"KEYWORD4\",\"text\":\"WrongArgumentCountException\"},{\"tag\":\"KEYWORD1\",\"text\":\"is\"},{\"tag\":\"KEYWORD1\",\"text\":\"implements\"},{\"tag\":\"KEYWORD1\",\"text\":\"const\"},{\"tag\":\"KEYWORD1\",\"text\":\"new\"},{\"tag\":\"LITERAL2\",\"text\":\"this\"},{\"tag\":\"LITERAL2\",\"text\":\"super\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"TRUE\",\"DIGIT_RE\":\"(0x[\\\\p{XDigit}]+[lL]?|[\\\\p{Digit}]+(e[\\\\p{Digit}]*)?[lLdDfF]?)\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"SEQ\",\"text\":\"//-->\",\"attrs\":{\"TYPE\":\"COMMENT2\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"//\",\"attrs\":{\"TYPE\":\"COMMENT2\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#!\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"#library\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"#import\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"#source\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"#resource\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"abstract\"},{\"tag\":\"KEYWORD1\",\"text\":\"assert\"},{\"tag\":\"KEYWORD1\",\"text\":\"class\"},{\"tag\":\"KEYWORD1\",\"text\":\"extends\"},{\"tag\":\"KEYWORD1\",\"text\":\"factory\"},{\"tag\":\"KEYWORD1\",\"text\":\"get\"},{\"tag\":\"KEYWORD1\",\"text\":\"import\"},{\"tag\":\"KEYWORD1\",\"text\":\"interface\"},{\"tag\":\"KEYWORD1\",\"text\":\"library\"},{\"tag\":\"KEYWORD1\",\"text\":\"negate\"},{\"tag\":\"KEYWORD1\",\"text\":\"operator\"},{\"tag\":\"KEYWORD1\",\"text\":\"set\"},{\"tag\":\"KEYWORD1\",\"text\":\"source\"},{\"tag\":\"KEYWORD1\",\"text\":\"static\"},{\"tag\":\"KEYWORD1\",\"text\":\"typedef\"},{\"tag\":\"KEYWORD1\",\"text\":\"var\"},{\"tag\":\"KEYWORD1\",\"text\":\"final\"},{\"tag\":\"KEYWORD1\",\"text\":\"if\"},{\"tag\":\"KEYWORD1\",\"text\":\"else\"},{\"tag\":\"KEYWORD1\",\"text\":\"for\"},{\"tag\":\"KEYWORD1\",\"text\":\"in\"},{\"tag\":\"KEYWORD1\",\"text\":\"while\"},{\"tag\":\"KEYWORD1\",\"text\":\"do\"},{\"tag\":\"KEYWORD1\",\"text\":\"switch\"},{\"tag\":\"KEYWORD1\",\"text\":\"case\"},{\"tag\":\"KEYWORD1\",\"text\":\"default\"},{\"tag\":\"KEYWORD1\",\"text\":\"in\"},{\"tag\":\"KEYWORD1\",\"text\":\"try\"},{\"tag\":\"KEYWORD1\",\"text\":\"catch\"},{\"tag\":\"KEYWORD1\",\"text\":\"finally\"},{\"tag\":\"KEYWORD1\",\"text\":\"return\"},{\"tag\":\"KEYWORD1\",\"text\":\"break\"},{\"tag\":\"KEYWORD1\",\"text\":\"continue\"},{\"tag\":\"KEYWORD1\",\"text\":\"throw\"},{\"tag\":\"KEYWORD1\",\"text\":\"assert\"}]},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"DART_EXPRESSION\"}}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}