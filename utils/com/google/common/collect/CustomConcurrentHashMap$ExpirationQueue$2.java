package com.google.common.collect;

class CustomConcurrentHashMap$ExpirationQueue$2 extends AbstractLinkedIterator<CustomConcurrentHashMap.ReferenceEntry<K, V>>
{
  CustomConcurrentHashMap$ExpirationQueue$2(CustomConcurrentHashMap.ExpirationQueue paramExpirationQueue, CustomConcurrentHashMap.ReferenceEntry paramReferenceEntry)
  {
    super(paramReferenceEntry);
  }

  protected CustomConcurrentHashMap.ReferenceEntry<K, V> a(CustomConcurrentHashMap.ReferenceEntry<K, V> paramReferenceEntry)
  {
    CustomConcurrentHashMap.ReferenceEntry localReferenceEntry = paramReferenceEntry.getNextExpirable();
    if (localReferenceEntry == this.a.a)
      localReferenceEntry = null;
    return localReferenceEntry;
  }
}

/* Location:           /data1/software/apk2java/dex2jar-0.0.9.12/secondary-1.dex_dex2jar.jar
 * Qualified Name:     com.google.common.collect.CustomConcurrentHashMap.ExpirationQueue.2
 * JD-Core Version:    0.6.2
 */