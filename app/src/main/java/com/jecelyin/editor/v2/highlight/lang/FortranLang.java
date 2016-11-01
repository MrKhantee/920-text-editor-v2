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
public class FortranLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"C\",\"NAME\":\"lineComment\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\",+-=<>/?^&*\",\"NAME\":\"wordBreakChars\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\\\\s*((if\\\\s*\\\\(.*\\\\)\\\\s*then|else\\\\s*|do\\\\s*)*)\",\"NAME\":\"indentNextLines\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"FALSE\",\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"EOL_SPAN\",\"text\":\"C\",\"attrs\":{\"TYPE\":\"COMMENT1\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"!\",\"attrs\":{\"TYPE\":\"COMMENT1\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"COMMENT1\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"!\",\"attrs\":{\"TYPE\":\"COMMENT1\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"D\",\"attrs\":{\"TYPE\":\"COMMENT2\",\"AT_LINE_START\":\"TRUE\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"FALSE\",\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"FALSE\",\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SEQ\",\"text\":\"<=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"&\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"==\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\".lt.\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\".gt.\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\".eq.\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\".ne.\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\".le.\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\".ge.\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\".AND.\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\".OR.\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"INCLUDE\"},{\"tag\":\"KEYWORD1\",\"text\":\"PROGRAM\"},{\"tag\":\"KEYWORD1\",\"text\":\"MODULE\"},{\"tag\":\"KEYWORD1\",\"text\":\"SUBROUTINE\"},{\"tag\":\"KEYWORD1\",\"text\":\"FUNCTION\"},{\"tag\":\"KEYWORD1\",\"text\":\"CONTAINS\"},{\"tag\":\"KEYWORD1\",\"text\":\"USE\"},{\"tag\":\"KEYWORD1\",\"text\":\"CALL\"},{\"tag\":\"KEYWORD1\",\"text\":\"RETURN\"},{\"tag\":\"KEYWORD1\",\"text\":\"IMPLICIT\"},{\"tag\":\"KEYWORD1\",\"text\":\"EXPLICIT\"},{\"tag\":\"KEYWORD1\",\"text\":\"NONE\"},{\"tag\":\"KEYWORD1\",\"text\":\"DATA\"},{\"tag\":\"KEYWORD1\",\"text\":\"PARAMETER\"},{\"tag\":\"KEYWORD1\",\"text\":\"ALLOCATE\"},{\"tag\":\"KEYWORD1\",\"text\":\"ALLOCATABLE\"},{\"tag\":\"KEYWORD1\",\"text\":\"ALLOCATED\"},{\"tag\":\"KEYWORD1\",\"text\":\"DEALLOCATE\"},{\"tag\":\"KEYWORD1\",\"text\":\"INTEGER\"},{\"tag\":\"KEYWORD1\",\"text\":\"REAL\"},{\"tag\":\"KEYWORD1\",\"text\":\"DOUBLE\"},{\"tag\":\"KEYWORD1\",\"text\":\"PRECISION\"},{\"tag\":\"KEYWORD1\",\"text\":\"COMPLEX\"},{\"tag\":\"KEYWORD1\",\"text\":\"LOGICAL\"},{\"tag\":\"KEYWORD1\",\"text\":\"CHARACTER\"},{\"tag\":\"KEYWORD1\",\"text\":\"DIMENSION\"},{\"tag\":\"KEYWORD1\",\"text\":\"KIND\"},{\"tag\":\"KEYWORD1\",\"text\":\"CASE\"},{\"tag\":\"KEYWORD1\",\"text\":\"SELECT\"},{\"tag\":\"KEYWORD1\",\"text\":\"DEFAULT\"},{\"tag\":\"KEYWORD1\",\"text\":\"CONTINUE\"},{\"tag\":\"KEYWORD1\",\"text\":\"CYCLE\"},{\"tag\":\"KEYWORD1\",\"text\":\"DO\"},{\"tag\":\"KEYWORD1\",\"text\":\"WHILE\"},{\"tag\":\"KEYWORD1\",\"text\":\"ELSE\"},{\"tag\":\"KEYWORD1\",\"text\":\"IF\"},{\"tag\":\"KEYWORD1\",\"text\":\"ELSEIF\"},{\"tag\":\"KEYWORD1\",\"text\":\"THEN\"},{\"tag\":\"KEYWORD1\",\"text\":\"ELSEWHERE\"},{\"tag\":\"KEYWORD1\",\"text\":\"END\"},{\"tag\":\"KEYWORD1\",\"text\":\"ENDIF\"},{\"tag\":\"KEYWORD1\",\"text\":\"ENDDO\"},{\"tag\":\"KEYWORD1\",\"text\":\"FORALL\"},{\"tag\":\"KEYWORD1\",\"text\":\"WHERE\"},{\"tag\":\"KEYWORD1\",\"text\":\"EXIT\"},{\"tag\":\"KEYWORD1\",\"text\":\"GOTO\"},{\"tag\":\"KEYWORD1\",\"text\":\"PAUSE\"},{\"tag\":\"KEYWORD1\",\"text\":\"STOP\"},{\"tag\":\"KEYWORD1\",\"text\":\"BACKSPACE\"},{\"tag\":\"KEYWORD1\",\"text\":\"CLOSE\"},{\"tag\":\"KEYWORD1\",\"text\":\"ENDFILE\"},{\"tag\":\"KEYWORD1\",\"text\":\"INQUIRE\"},{\"tag\":\"KEYWORD1\",\"text\":\"OPEN\"},{\"tag\":\"KEYWORD1\",\"text\":\"PRINT\"},{\"tag\":\"KEYWORD1\",\"text\":\"READ\"},{\"tag\":\"KEYWORD1\",\"text\":\"REWIND\"},{\"tag\":\"KEYWORD1\",\"text\":\"WRITE\"},{\"tag\":\"KEYWORD1\",\"text\":\"FORMAT\"},{\"tag\":\"KEYWORD1\",\"text\":\"AIMAG\"},{\"tag\":\"KEYWORD1\",\"text\":\"AINT\"},{\"tag\":\"KEYWORD1\",\"text\":\"AMAX0\"},{\"tag\":\"KEYWORD1\",\"text\":\"AMIN0\"},{\"tag\":\"KEYWORD1\",\"text\":\"ANINT\"},{\"tag\":\"KEYWORD1\",\"text\":\"CEILING\"},{\"tag\":\"KEYWORD1\",\"text\":\"CMPLX\"},{\"tag\":\"KEYWORD1\",\"text\":\"CONJG\"},{\"tag\":\"KEYWORD1\",\"text\":\"DBLE\"},{\"tag\":\"KEYWORD1\",\"text\":\"DCMPLX\"},{\"tag\":\"KEYWORD1\",\"text\":\"DFLOAT\"},{\"tag\":\"KEYWORD1\",\"text\":\"DIM\"},{\"tag\":\"KEYWORD1\",\"text\":\"DPROD\"},{\"tag\":\"KEYWORD1\",\"text\":\"FLOAT\"},{\"tag\":\"KEYWORD1\",\"text\":\"FLOOR\"},{\"tag\":\"KEYWORD1\",\"text\":\"IFIX\"},{\"tag\":\"KEYWORD1\",\"text\":\"IMAG\"},{\"tag\":\"KEYWORD1\",\"text\":\"INT\"},{\"tag\":\"KEYWORD1\",\"text\":\"LOGICAL\"},{\"tag\":\"KEYWORD1\",\"text\":\"MODULO\"},{\"tag\":\"KEYWORD1\",\"text\":\"NINT\"},{\"tag\":\"KEYWORD1\",\"text\":\"REAL\"},{\"tag\":\"KEYWORD1\",\"text\":\"SIGN\"},{\"tag\":\"KEYWORD1\",\"text\":\"SNGL\"},{\"tag\":\"KEYWORD1\",\"text\":\"TRANSFER\"},{\"tag\":\"KEYWORD1\",\"text\":\"ZEXT\"},{\"tag\":\"KEYWORD1\",\"text\":\"ABS\"},{\"tag\":\"KEYWORD1\",\"text\":\"ACOS\"},{\"tag\":\"KEYWORD1\",\"text\":\"AIMAG\"},{\"tag\":\"KEYWORD1\",\"text\":\"AINT\"},{\"tag\":\"KEYWORD1\",\"text\":\"ALOG\"},{\"tag\":\"KEYWORD1\",\"text\":\"ALOG10\"},{\"tag\":\"KEYWORD1\",\"text\":\"AMAX0\"},{\"tag\":\"KEYWORD1\",\"text\":\"AMAX1\"},{\"tag\":\"KEYWORD1\",\"text\":\"AMIN0\"},{\"tag\":\"KEYWORD1\",\"text\":\"AMIN1\"},{\"tag\":\"KEYWORD1\",\"text\":\"AMOD\"},{\"tag\":\"KEYWORD1\",\"text\":\"ANINT\"},{\"tag\":\"KEYWORD1\",\"text\":\"ASIN\"},{\"tag\":\"KEYWORD1\",\"text\":\"ATAN\"},{\"tag\":\"KEYWORD1\",\"text\":\"ATAN2\"},{\"tag\":\"KEYWORD1\",\"text\":\"CABS\"},{\"tag\":\"KEYWORD1\",\"text\":\"CCOS\"},{\"tag\":\"KEYWORD1\",\"text\":\"CHAR\"},{\"tag\":\"KEYWORD1\",\"text\":\"CLOG\"},{\"tag\":\"KEYWORD1\",\"text\":\"CMPLX\"},{\"tag\":\"KEYWORD1\",\"text\":\"CONJG\"},{\"tag\":\"KEYWORD1\",\"text\":\"COS\"},{\"tag\":\"KEYWORD1\",\"text\":\"COSH\"},{\"tag\":\"KEYWORD1\",\"text\":\"CSIN\"},{\"tag\":\"KEYWORD1\",\"text\":\"CSQRT\"},{\"tag\":\"KEYWORD1\",\"text\":\"DABS\"},{\"tag\":\"KEYWORD1\",\"text\":\"DACOS\"},{\"tag\":\"KEYWORD1\",\"text\":\"DASIN\"},{\"tag\":\"KEYWORD1\",\"text\":\"DATAN\"},{\"tag\":\"KEYWORD1\",\"text\":\"DATAN2\"},{\"tag\":\"KEYWORD1\",\"text\":\"DBLE\"},{\"tag\":\"KEYWORD1\",\"text\":\"DCOS\"},{\"tag\":\"KEYWORD1\",\"text\":\"DCOSH\"},{\"tag\":\"KEYWORD1\",\"text\":\"DDIM\"},{\"tag\":\"KEYWORD1\",\"text\":\"DEXP\"},{\"tag\":\"KEYWORD1\",\"text\":\"DIM\"},{\"tag\":\"KEYWORD1\",\"text\":\"DINT\"},{\"tag\":\"KEYWORD1\",\"text\":\"DLOG\"},{\"tag\":\"KEYWORD1\",\"text\":\"DLOG10\"},{\"tag\":\"KEYWORD1\",\"text\":\"DMAX1\"},{\"tag\":\"KEYWORD1\",\"text\":\"DMIN1\"},{\"tag\":\"KEYWORD1\",\"text\":\"DMOD\"},{\"tag\":\"KEYWORD1\",\"text\":\"DNINT\"},{\"tag\":\"KEYWORD1\",\"text\":\"DPROD\"},{\"tag\":\"KEYWORD1\",\"text\":\"DREAL\"},{\"tag\":\"KEYWORD1\",\"text\":\"DSIGN\"},{\"tag\":\"KEYWORD1\",\"text\":\"DSIN\"},{\"tag\":\"KEYWORD1\",\"text\":\"DSINH\"},{\"tag\":\"KEYWORD1\",\"text\":\"DSQRT\"},{\"tag\":\"KEYWORD1\",\"text\":\"DTAN\"},{\"tag\":\"KEYWORD1\",\"text\":\"DTANH\"},{\"tag\":\"KEYWORD1\",\"text\":\"EXP\"},{\"tag\":\"KEYWORD1\",\"text\":\"FLOAT\"},{\"tag\":\"KEYWORD1\",\"text\":\"IABS\"},{\"tag\":\"KEYWORD1\",\"text\":\"ICHAR\"},{\"tag\":\"KEYWORD1\",\"text\":\"IDIM\"},{\"tag\":\"KEYWORD1\",\"text\":\"IDINT\"},{\"tag\":\"KEYWORD1\",\"text\":\"IDNINT\"},{\"tag\":\"KEYWORD1\",\"text\":\"IFIX\"},{\"tag\":\"KEYWORD1\",\"text\":\"INDEX\"},{\"tag\":\"KEYWORD1\",\"text\":\"INT\"},{\"tag\":\"KEYWORD1\",\"text\":\"ISIGN\"},{\"tag\":\"KEYWORD1\",\"text\":\"LEN\"},{\"tag\":\"KEYWORD1\",\"text\":\"LGE\"},{\"tag\":\"KEYWORD1\",\"text\":\"LGT\"},{\"tag\":\"KEYWORD1\",\"text\":\"LLE\"},{\"tag\":\"KEYWORD1\",\"text\":\"LLT\"},{\"tag\":\"KEYWORD1\",\"text\":\"LOG\"},{\"tag\":\"KEYWORD1\",\"text\":\"LOG10\"},{\"tag\":\"KEYWORD1\",\"text\":\"MAX\"},{\"tag\":\"KEYWORD1\",\"text\":\"MAX0\"},{\"tag\":\"KEYWORD1\",\"text\":\"MAX1\"},{\"tag\":\"KEYWORD1\",\"text\":\"MIN\"},{\"tag\":\"KEYWORD1\",\"text\":\"MIN0\"},{\"tag\":\"KEYWORD1\",\"text\":\"MIN1\"},{\"tag\":\"KEYWORD1\",\"text\":\"MOD\"},{\"tag\":\"KEYWORD1\",\"text\":\"NINT\"},{\"tag\":\"KEYWORD1\",\"text\":\"REAL\"},{\"tag\":\"KEYWORD1\",\"text\":\"SIGN\"},{\"tag\":\"KEYWORD1\",\"text\":\"SIN\"},{\"tag\":\"KEYWORD1\",\"text\":\"SINH\"},{\"tag\":\"KEYWORD1\",\"text\":\"SNGL\"},{\"tag\":\"KEYWORD1\",\"text\":\"SQRT\"},{\"tag\":\"KEYWORD1\",\"text\":\"TAN\"},{\"tag\":\"KEYWORD1\",\"text\":\"TANH\"},{\"tag\":\"KEYWORD1\",\"text\":\".false.\"},{\"tag\":\"KEYWORD1\",\"text\":\".true.\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}