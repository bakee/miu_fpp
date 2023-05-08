```mermaid

graph TD;
    Object-->AbstractCollection
    AbstractCollection-->AbstractList
    AbstractList-->ArrayList
    AbstractList-->Vector
    Vector-->Stack
    AbstractList-->AbstractSequencialList
    AbstractSequencialList-->LinkedList

    Iterable-.->Collection
    Collection-.->List
    Collection-.->Queue
    Collection-.->Set
    Deque-.->LinkedList
    List-.->LinkedList
    Queue-.->Deque




```
