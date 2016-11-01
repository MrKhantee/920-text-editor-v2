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
public class OccamLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"--\",\"NAME\":\"commentStart\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\",\"NAME\":\"commentEnd\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\",\"NAME\":\"blockComment\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\".\",\"NAME\":\"noWordSep\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"TRUE\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"EOL_SPAN\",\"text\":\"--\",\"attrs\":{\"TYPE\":\"COMMENT1\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#\",\"attrs\":{\"TYPE\":\"COMMENT2\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SEQ\",\"text\":\":=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">>\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<>\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"><\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"-\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"?\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"!\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/\\\\\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"~\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"ALT\"},{\"tag\":\"KEYWORD1\",\"text\":\"ASM\"},{\"tag\":\"KEYWORD1\",\"text\":\"CASE\"},{\"tag\":\"KEYWORD1\",\"text\":\"FUNCTION\"},{\"tag\":\"KEYWORD1\",\"text\":\"IF\"},{\"tag\":\"KEYWORD1\",\"text\":\"INLINE\"},{\"tag\":\"KEYWORD1\",\"text\":\"PAR\"},{\"tag\":\"KEYWORD1\",\"text\":\"PLACED\"},{\"tag\":\"KEYWORD1\",\"text\":\"PRI\"},{\"tag\":\"KEYWORD1\",\"text\":\"PROC\"},{\"tag\":\"KEYWORD1\",\"text\":\"RESULT\"},{\"tag\":\"KEYWORD1\",\"text\":\"SEQ\"},{\"tag\":\"KEYWORD1\",\"text\":\"VALOF\"},{\"tag\":\"KEYWORD1\",\"text\":\"WHILE\"},{\"tag\":\"KEYWORD2\",\"text\":\"AT\"},{\"tag\":\"KEYWORD2\",\"text\":\"ELSE\"},{\"tag\":\"KEYWORD2\",\"text\":\"FOR\"},{\"tag\":\"KEYWORD2\",\"text\":\"FROM\"},{\"tag\":\"KEYWORD2\",\"text\":\"IS\"},{\"tag\":\"KEYWORD2\",\"text\":\"PLACE\"},{\"tag\":\"KEYWORD2\",\"text\":\"PORT\"},{\"tag\":\"KEYWORD2\",\"text\":\"PROTOCOL\"},{\"tag\":\"KEYWORD2\",\"text\":\"SKIP\"},{\"tag\":\"KEYWORD2\",\"text\":\"STOP\"},{\"tag\":\"KEYWORD2\",\"text\":\"VAL\"},{\"tag\":\"KEYWORD2\",\"text\":\"AFTER\"},{\"tag\":\"KEYWORD2\",\"text\":\"AND\"},{\"tag\":\"KEYWORD2\",\"text\":\"ANY\"},{\"tag\":\"KEYWORD2\",\"text\":\"BITAND\"},{\"tag\":\"KEYWORD2\",\"text\":\"BITNOT\"},{\"tag\":\"KEYWORD2\",\"text\":\"BITOR\"},{\"tag\":\"KEYWORD2\",\"text\":\"BOOL\"},{\"tag\":\"KEYWORD2\",\"text\":\"BYTE\"},{\"tag\":\"KEYWORD2\",\"text\":\"BYTESIN\"},{\"tag\":\"KEYWORD2\",\"text\":\"CHAN\"},{\"tag\":\"KEYWORD2\",\"text\":\"DATA\"},{\"tag\":\"KEYWORD2\",\"text\":\"INT\"},{\"tag\":\"KEYWORD2\",\"text\":\"INT32\"},{\"tag\":\"KEYWORD2\",\"text\":\"INT16\"},{\"tag\":\"KEYWORD2\",\"text\":\"INT64\"},{\"tag\":\"KEYWORD2\",\"text\":\"MINUS\"},{\"tag\":\"KEYWORD2\",\"text\":\"MOSTNEG\"},{\"tag\":\"KEYWORD2\",\"text\":\"MOSTPOS\"},{\"tag\":\"KEYWORD2\",\"text\":\"NOT\"},{\"tag\":\"KEYWORD2\",\"text\":\"PLUS\"},{\"tag\":\"KEYWORD2\",\"text\":\"OF\"},{\"tag\":\"KEYWORD2\",\"text\":\"OFFSETOF\"},{\"tag\":\"KEYWORD2\",\"text\":\"OR\"},{\"tag\":\"KEYWORD2\",\"text\":\"PACKED\"},{\"tag\":\"KEYWORD2\",\"text\":\"REAL32\"},{\"tag\":\"KEYWORD2\",\"text\":\"REAL64\"},{\"tag\":\"KEYWORD2\",\"text\":\"RECORD\"},{\"tag\":\"KEYWORD2\",\"text\":\"REM\"},{\"tag\":\"KEYWORD2\",\"text\":\"RESHAPES\"},{\"tag\":\"KEYWORD2\",\"text\":\"RETYPES\"},{\"tag\":\"KEYWORD2\",\"text\":\"ROUND\"},{\"tag\":\"KEYWORD2\",\"text\":\"SIZE\"},{\"tag\":\"KEYWORD2\",\"text\":\"TIMER\"},{\"tag\":\"KEYWORD2\",\"text\":\"TIMES\"},{\"tag\":\"KEYWORD2\",\"text\":\"TRUNC\"},{\"tag\":\"KEYWORD2\",\"text\":\"TYPE\"},{\"tag\":\"KEYWORD2\",\"text\":\"BUCKET\"},{\"tag\":\"KEYWORD2\",\"text\":\"CLAIM\"},{\"tag\":\"KEYWORD2\",\"text\":\"ENROLL\"},{\"tag\":\"KEYWORD2\",\"text\":\"EVENT\"},{\"tag\":\"KEYWORD2\",\"text\":\"FALL\"},{\"tag\":\"KEYWORD2\",\"text\":\"FLUSH\"},{\"tag\":\"KEYWORD2\",\"text\":\"GRANT\"},{\"tag\":\"KEYWORD2\",\"text\":\"INITIAL\"},{\"tag\":\"KEYWORD2\",\"text\":\"RESOURCE\"},{\"tag\":\"KEYWORD2\",\"text\":\"SEMAPHORE\"},{\"tag\":\"KEYWORD2\",\"text\":\"SHARED\"},{\"tag\":\"KEYWORD2\",\"text\":\"SYNC\"},{\"tag\":\"KEYWORD3\",\"text\":\"LONGADD\"},{\"tag\":\"KEYWORD3\",\"text\":\"LONGSUB\"},{\"tag\":\"KEYWORD3\",\"text\":\"ASHIFTRIGHT\"},{\"tag\":\"KEYWORD3\",\"text\":\"ASHIFTLEFT\"},{\"tag\":\"KEYWORD3\",\"text\":\"ROTATERIGHT\"},{\"tag\":\"KEYWORD3\",\"text\":\"ROTATELEFT\"},{\"tag\":\"KEYWORD3\",\"text\":\"LONGSUM\"},{\"tag\":\"KEYWORD3\",\"text\":\"LONGDIFF\"},{\"tag\":\"KEYWORD3\",\"text\":\"LONGPROD\"},{\"tag\":\"KEYWORD3\",\"text\":\"LONGDIV\"},{\"tag\":\"KEYWORD3\",\"text\":\"SHIFTLEFT\"},{\"tag\":\"KEYWORD3\",\"text\":\"SHIFTRIGHT\"},{\"tag\":\"KEYWORD3\",\"text\":\"NORMALISE\"},{\"tag\":\"KEYWORD3\",\"text\":\"ABS\"},{\"tag\":\"KEYWORD3\",\"text\":\"DABS\"},{\"tag\":\"KEYWORD3\",\"text\":\"SCALEB\"},{\"tag\":\"KEYWORD3\",\"text\":\"DSCALEB\"},{\"tag\":\"KEYWORD3\",\"text\":\"COPYSIGN\"},{\"tag\":\"KEYWORD3\",\"text\":\"DCOPYSIGN\"},{\"tag\":\"KEYWORD3\",\"text\":\"SQRT\"},{\"tag\":\"KEYWORD3\",\"text\":\"DSQRT\"},{\"tag\":\"KEYWORD3\",\"text\":\"MINUSX\"},{\"tag\":\"KEYWORD3\",\"text\":\"DMINUSX\"},{\"tag\":\"KEYWORD3\",\"text\":\"NEXTAFTER\"},{\"tag\":\"KEYWORD3\",\"text\":\"DNEXTAFTER\"},{\"tag\":\"KEYWORD3\",\"text\":\"MULBY2\"},{\"tag\":\"KEYWORD3\",\"text\":\"DMULBY2\"},{\"tag\":\"KEYWORD3\",\"text\":\"DIVBY2\"},{\"tag\":\"KEYWORD3\",\"text\":\"DDIVBY2\"},{\"tag\":\"KEYWORD3\",\"text\":\"LOGB\"},{\"tag\":\"KEYWORD3\",\"text\":\"DLOGB\"},{\"tag\":\"KEYWORD3\",\"text\":\"ISNAN\"},{\"tag\":\"KEYWORD3\",\"text\":\"DISNAN\"},{\"tag\":\"KEYWORD3\",\"text\":\"NOTFINITE\"},{\"tag\":\"KEYWORD3\",\"text\":\"DNOTFINITE\"},{\"tag\":\"KEYWORD3\",\"text\":\"ORDERED\"},{\"tag\":\"KEYWORD3\",\"text\":\"DORDERED\"},{\"tag\":\"KEYWORD3\",\"text\":\"FLOATING.UNPACK\"},{\"tag\":\"KEYWORD3\",\"text\":\"DFLOATING.UNPACK\"},{\"tag\":\"KEYWORD3\",\"text\":\"ARGUMENT.REDUCE\"},{\"tag\":\"KEYWORD3\",\"text\":\"DARGUMENT.REDUCE\"},{\"tag\":\"KEYWORD3\",\"text\":\"FPINT\"},{\"tag\":\"KEYWORD3\",\"text\":\"DFPINT\"},{\"tag\":\"KEYWORD3\",\"text\":\"REAL32OP\"},{\"tag\":\"KEYWORD3\",\"text\":\"REAL64OP\"},{\"tag\":\"KEYWORD3\",\"text\":\"IEEE32OP\"},{\"tag\":\"KEYWORD3\",\"text\":\"IEEE64OP\"},{\"tag\":\"KEYWORD3\",\"text\":\"REAL32REM\"},{\"tag\":\"KEYWORD3\",\"text\":\"REAL64REM\"},{\"tag\":\"KEYWORD3\",\"text\":\"IEEE32REM\"},{\"tag\":\"KEYWORD3\",\"text\":\"IEEE64REM\"},{\"tag\":\"KEYWORD3\",\"text\":\"REAL32EQ\"},{\"tag\":\"KEYWORD3\",\"text\":\"REAL64EQ\"},{\"tag\":\"KEYWORD3\",\"text\":\"REAL32GT\"},{\"tag\":\"KEYWORD3\",\"text\":\"REAL64GT\"},{\"tag\":\"KEYWORD3\",\"text\":\"IEEECOMPARE\"},{\"tag\":\"KEYWORD3\",\"text\":\"DIEEECOMPARE\"},{\"tag\":\"KEYWORD3\",\"text\":\"ALOG\"},{\"tag\":\"KEYWORD3\",\"text\":\"DALOG\"},{\"tag\":\"KEYWORD3\",\"text\":\"ALOG10\"},{\"tag\":\"KEYWORD3\",\"text\":\"DALOG10\"},{\"tag\":\"KEYWORD3\",\"text\":\"EXP\"},{\"tag\":\"KEYWORD3\",\"text\":\"DEXP\"},{\"tag\":\"KEYWORD3\",\"text\":\"TAN\"},{\"tag\":\"KEYWORD3\",\"text\":\"DTAN\"},{\"tag\":\"KEYWORD3\",\"text\":\"SIN\"},{\"tag\":\"KEYWORD3\",\"text\":\"DSIN\"},{\"tag\":\"KEYWORD3\",\"text\":\"ASIN\"},{\"tag\":\"KEYWORD3\",\"text\":\"DASIN\"},{\"tag\":\"KEYWORD3\",\"text\":\"COS\"},{\"tag\":\"KEYWORD3\",\"text\":\"DCOS\"},{\"tag\":\"KEYWORD3\",\"text\":\"SINH\"},{\"tag\":\"KEYWORD3\",\"text\":\"DSINH\"},{\"tag\":\"KEYWORD3\",\"text\":\"COSH\"},{\"tag\":\"KEYWORD3\",\"text\":\"DCOSH\"},{\"tag\":\"KEYWORD3\",\"text\":\"TANH\"},{\"tag\":\"KEYWORD3\",\"text\":\"DTANH\"},{\"tag\":\"KEYWORD3\",\"text\":\"ATAN\"},{\"tag\":\"KEYWORD3\",\"text\":\"DATAN\"},{\"tag\":\"KEYWORD3\",\"text\":\"ATAN2\"},{\"tag\":\"KEYWORD3\",\"text\":\"DATAN2\"},{\"tag\":\"KEYWORD3\",\"text\":\"RAN\"},{\"tag\":\"KEYWORD3\",\"text\":\"DRAN\"},{\"tag\":\"KEYWORD3\",\"text\":\"POWER\"},{\"tag\":\"KEYWORD3\",\"text\":\"DPOWER\"},{\"tag\":\"KEYWORD3\",\"text\":\"INTTOSTRING\"},{\"tag\":\"KEYWORD3\",\"text\":\"INT16TOSTRING\"},{\"tag\":\"KEYWORD3\",\"text\":\"INT32TOSTRING\"},{\"tag\":\"KEYWORD3\",\"text\":\"INT64TOSTRING\"},{\"tag\":\"KEYWORD3\",\"text\":\"STRINGTOINT\"},{\"tag\":\"KEYWORD3\",\"text\":\"STRINGTOINT16\"},{\"tag\":\"KEYWORD3\",\"text\":\"STRINGTOINT32\"},{\"tag\":\"KEYWORD3\",\"text\":\"STRINGTOINT64\"},{\"tag\":\"KEYWORD3\",\"text\":\"HEXTOSTRING\"},{\"tag\":\"KEYWORD3\",\"text\":\"HEX16TOSTRING\"},{\"tag\":\"KEYWORD3\",\"text\":\"HEX32TOSTRING\"},{\"tag\":\"KEYWORD3\",\"text\":\"HEX64TOSTRING\"},{\"tag\":\"KEYWORD3\",\"text\":\"STRINGTOHEX\"},{\"tag\":\"KEYWORD3\",\"text\":\"STRINGTOHEX16\"},{\"tag\":\"KEYWORD3\",\"text\":\"STRINGTOHEX32\"},{\"tag\":\"KEYWORD3\",\"text\":\"STRINGTOHEX64\"},{\"tag\":\"KEYWORD3\",\"text\":\"STRINGTOREAL32\"},{\"tag\":\"KEYWORD3\",\"text\":\"STRINGTOREAL64\"},{\"tag\":\"KEYWORD3\",\"text\":\"REAL32TOSTRING\"},{\"tag\":\"KEYWORD3\",\"text\":\"REAL64TOSTRING\"},{\"tag\":\"KEYWORD3\",\"text\":\"STRINGTOBOOL\"},{\"tag\":\"KEYWORD3\",\"text\":\"BOOLTOSTRING\"},{\"tag\":\"KEYWORD3\",\"text\":\"RESCHEDULE\"},{\"tag\":\"KEYWORD3\",\"text\":\"ASSERT\"},{\"tag\":\"LITERAL2\",\"text\":\"FALSE\"},{\"tag\":\"LITERAL2\",\"text\":\"TRUE\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}