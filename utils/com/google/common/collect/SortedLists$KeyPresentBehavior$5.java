package com.google.common.collect;

import java.util.Comparator;
import java.util.List;

 enum SortedLists$KeyPresentBehavior$5
{
  SortedLists$KeyPresentBehavior$5()
  {
    super(str, i, null);
  }

  public <E> int resultIndex(Comparator<? super E> paramComparator, E paramE, List<? extends E> paramList, int paramInt)
  {
    return -1 + FIRST_PRESENT.resultIndex(paramComparator, paramE, paramList, paramInt);
  }
}

/* Location:           /data1/software/apk2java/dex2jar-0.0.9.12/secondary-1.dex_dex2jar.jar
 * Qualified Name:     com.google.common.collect.SortedLists.KeyPresentBehavior.5
 * JD-Core Version:    0.6.2
 */