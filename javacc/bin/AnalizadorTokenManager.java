/* Generated By:JavaCC: Do not edit this line. AnalizadorTokenManager.java */

/** Token Manager. */
public class AnalizadorTokenManager implements AnalizadorConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1f9acb2L) != 0L)
         {
            jjmatchedKind = 36;
            return 34;
         }
         if ((active0 & 0x4000000L) != 0L)
            return 17;
         return -1;
      case 1:
         if ((active0 & 0x1f9acb2L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 1;
            return 34;
         }
         return -1;
      case 2:
         if ((active0 & 0x1f98c92L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 2;
            return 34;
         }
         if ((active0 & 0x2020L) != 0L)
            return 34;
         return -1;
      case 3:
         if ((active0 & 0x1b18c92L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 3;
            return 34;
         }
         if ((active0 & 0x480000L) != 0L)
            return 34;
         return -1;
      case 4:
         if ((active0 & 0x1b18c12L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 4;
            return 34;
         }
         if ((active0 & 0x80L) != 0L)
            return 34;
         return -1;
      case 5:
         if ((active0 & 0x1018412L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 5;
            return 34;
         }
         if ((active0 & 0xb00800L) != 0L)
            return 34;
         return -1;
      case 6:
         if ((active0 & 0x2L) != 0L)
            return 34;
         if ((active0 & 0x1018410L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 6;
            return 34;
         }
         return -1;
      case 7:
         if ((active0 & 0x10410L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 7;
            return 34;
         }
         if ((active0 & 0x1008000L) != 0L)
            return 34;
         return -1;
      case 8:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 8;
            return 34;
         }
         if ((active0 & 0x410L) != 0L)
            return 34;
         return -1;
      case 9:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 9;
            return 34;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 38:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 40:
         return jjStopAtPos(0, 12);
      case 41:
         return jjStopAtPos(0, 14);
      case 42:
         return jjStopAtPos(0, 25);
      case 43:
         return jjStopAtPos(0, 28);
      case 44:
         return jjStopAtPos(0, 9);
      case 45:
         return jjStopAtPos(0, 29);
      case 46:
         return jjStopAtPos(0, 6);
      case 47:
         return jjStartNfaWithStates_0(0, 26, 17);
      case 58:
         return jjStopAtPos(0, 2);
      case 59:
         return jjStopAtPos(0, 3);
      case 60:
         jjmatchedKind = 33;
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 61:
         jjmatchedKind = 8;
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x1010000L);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 71:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x880002L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 85:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 86:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 123:
         return jjStopAtPos(0, 17);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 125:
         return jjStopAtPos(0, 18);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         break;
      case 61:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         break;
      case 62:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000410L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x488002L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x2020L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x200080L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x810000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 124:
         if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(1, 30);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x500000L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 110:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 34);
         return jjMoveStringLiteralDfa3_0(active0, 0x10002L);
      case 114:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 34);
         return jjMoveStringLiteralDfa3_0(active0, 0x1000410L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 80:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x2L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x800400L);
      case 108:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 34);
         break;
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x8080L);
      case 114:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(3, 19, 34);
         break;
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x10L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 84:
         return jjMoveStringLiteralDfa5_0(active0, 0x2L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x100400L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x1800000L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x10L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 110:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(4, 7, 34);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x200800L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa6_0(active0, 0x10L);
      case 76:
         return jjMoveStringLiteralDfa6_0(active0, 0x2L);
      case 98:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 103:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(5, 11, 34);
         break;
      case 111:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(5, 21, 34);
         else if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(5, 23, 34);
         break;
      case 114:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(5, 20, 34);
         break;
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000L);
      case 118:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 80:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(6, 1, 34);
         break;
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x1008000L);
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000L);
      case 106:
         return jjMoveStringLiteralDfa7_0(active0, 0x10L);
      case 108:
         return jjMoveStringLiteralDfa7_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x410L);
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x10000L);
      case 114:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(7, 15, 34);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(7, 24, 34);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 99:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(8, 4, 34);
         break;
      case 110:
         return jjMoveStringLiteralDfa9_0(active0, 0x10000L);
      case 115:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(8, 10, 34);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa10_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 108:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(10, 16, 34);
         break;
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 34;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 34:
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAddStates(0, 2);
                  }
                  else if ((0x100002600L & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                  }
                  else if (curChar == 34)
                     jjAddStates(3, 4);
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 13:
                  if ((0x100002600L & l) != 0L && kind > 41)
                     kind = 41;
                  break;
               case 14:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(15, 16);
                  break;
               case 15:
                  if ((0xfffffff7fffffbffL & l) != 0L)
                     jjCheckNAddTwoStates(15, 16);
                  break;
               case 16:
                  if ((0x800000400L & l) != 0L && kind > 42)
                     kind = 42;
                  break;
               case 17:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 18:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if (curChar == 34)
                     jjAddStates(3, 4);
                  break;
               case 20:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAdd(21);
                  break;
               case 21:
                  if (curChar == 34 && kind > 40)
                     kind = 40;
                  break;
               case 23:
                  if (curChar == 34)
                     jjCheckNAdd(21);
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAddStates(0, 2);
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(27);
                  break;
               case 28:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(28, 29);
                  break;
               case 29:
                  if (curChar == 46)
                     jjCheckNAdd(30);
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAddTwoStates(30, 31);
                  break;
               case 32:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(33);
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAdd(33);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 34:
               case 2:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 36)
                        kind = 36;
                     jjCheckNAddTwoStates(1, 2);
                  }
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 11;
                  else if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 3:
                  if (curChar == 111 && kind > 39)
                     kind = 39;
                  break;
               case 4:
                  if (curChar == 116)
                     jjCheckNAdd(3);
                  break;
               case 5:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 115)
                     jjCheckNAdd(3);
                  break;
               case 10:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 15:
                  jjAddStates(5, 6);
                  break;
               case 20:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAdd(21);
                  break;
               case 22:
                  if (curChar == 92)
                     jjAddStates(7, 9);
                  break;
               case 24:
                  if (curChar == 92)
                     jjCheckNAdd(21);
                  break;
               case 25:
                  if (curChar == 110)
                     jjCheckNAdd(21);
                  break;
               case 31:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 15:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(5, 6);
                  break;
               case 20:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 34 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   27, 28, 29, 20, 22, 15, 16, 23, 24, 25, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\114\145\156\147\124\114\120", "\72", "\73", 
"\120\141\162\164\145\105\152\145\143", "\106\151\156", "\56", "\125\156\151\157\156", "\75", "\54", 
"\126\141\162\151\141\142\154\145\163", "\123\165\142\120\162\147", "\50", "\144\151\162", "\51", 
"\104\145\166\157\154\166\145\162", "\103\157\156\144\151\143\151\157\156\141\154", "\173", "\175", 
"\114\145\145\162", "\107\162\141\142\141\162", "\105\156\164\145\162\157", "\122\145\141\154", 
"\114\157\147\151\143\157", "\103\141\162\141\143\164\145\162", "\52", "\57", "\46\46", "\53", "\55", 
"\174\174", "\75\75", "\74\76", "\74", null, null, null, null, null, null, null, null, 
null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1f3ffffffffL, 
};
static final long[] jjtoSkip = {
   0x60000000000L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[34];
static private final int[] jjstateSet = new int[68];
static protected char curChar;
/** Constructor. */
public AnalizadorTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public AnalizadorTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 34; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
