public class SajatLinkedList {

    private class Node {
        int value;
        Node previousNode = null;
        Node nextNode = null;

        public Node(int value, Node previousNode, Node nextNode) {
            this.value = value;
            this.previousNode = previousNode;
            this.nextNode = nextNode;
        }
    }

    private Node head = null;
    private Node tail = null;
    private Node actualNode = null;
    private int size;

    //public boolean isEmpty()
    //return actualNode == head

    public boolean isEmpty() {
        return head == tail;
    }
    //public boolean isFirst()
    //return actualNode == tail

    public boolean isFirst() {
        return head == actualNode;
    }
    //public boolean isLast()
    //HA actualNode !=null AKKOR return actualNode.value
    public boolean isLast(){
        return tail == actualNode;
    }
    //public int getActualValue() {
    //HA actualNode !=null AKKOR actualNode.value = value
    public int getActualValue() {
        if (actualNode !=null){
           return actualNode.value;
        } else {
            return 0;
        }
    }

    //public void setActualNodeValue(int newValue) {
    //HA actualNode !=null ÉS ¬isLast() AKKOR actualNode <- actualNode.prevoiusNode

    public void setActualNodeValue(int newValue) {
        if (actualNode != null) {
            actualNode.value = newValue;
        }
    }
    //public void stepBackward() {
    //HA actualNode != null ÉS ¬isFirst() AKKOR actualNode <- actualNode.nextNode

    public void stepBackward() {
        if ((actualNode != null) && !isFirst()) {
            actualNode = actualNode.previousNode;
        }
    }
    //public void stepForeward() {
    //actualNode <- tail

    public void stepForeward() {
        if ((actualNode != null) && !isLast()) {
            actualNode = actualNode.nextNode;
        }
    }
    //public void stepLast()
    //actualNod <- Head
    public void stepLast(){
        actualNode = tail;
    }
    public void stepFirst(){
        actualNode = head;
    }
    /*
    insertFirst(ertek)
        actualNode <- ujCsomopon <- ÚJ Node
        ujCsomopont.Ertek <- ertek
        ujCsomopont.Elozo <- null
        ujCsomopont.Kovetkezo <- Head
        HA isEmpty() AKKOR Head <- Tail <- ujCsomopont
        KÜLÖNBEN
        Head.Elozo <- ujCsomopont
        Head <- ujCsomopont
     */

    public void insertFirst(int value) {
        Node node1 = new Node(value, null, head);
        actualNode = node1;
        if (isEmpty()) {
            head = tail = node1;
        } else {
            head.previousNode = node1;
            head = node1;
        }
    }
    /*
    insertLast(ertek)
    HA isEmpty() AKKOR insertFirst(ertek)
    KÜLÖNBEN
    Akt <- ujCsomopont <- ÚJ Node
    ujCsomopont.Ertek <- ertek
    ujCsomopont.Elozo <- Tail
    ujCsomopont.Kovetkezo <- null
    Tail.Kovetkezo <- ujCsomopont
    Tail <- ujCsomopont
    */
    public void insertLast(int value) {

        if (isEmpty()) {
            insertFirst(value);
        } else {
            Node node1 = new Node(value, tail, null);
            actualNode = node1;
            tail.nextNode = actualNode;
            tail = actualNode;
        }

    }
    /*
    insertBefore(ertek)
    HA isEmpty() VAGY isFirst() AKKOR insertFirst(ertek)
    KÜLÖNBEN
        ujCsomopont <- ÚJ Node
        ujCsomopont.Ertek <- ertek
        ujCsomopont.Elozo <- Akt.Elozo
        ujCsomopont.Kovetkezo <- Akt
        Akt.Elozo.Kovetkezo <- ujCsomopont
        Akt.Elozo <- ujCsomopont
        Akt <- ujCsomopont
     */
    public void insertBefore(int value) {
        if (isEmpty() || isFirst()) {
            insertFirst(value);
        } else {
            Node node1 = new Node(value, actualNode.previousNode, actualNode);
            actualNode.previousNode.nextNode = node1;
            actualNode.previousNode = node1;
            actualNode = node1;
        }
    }
    /*
    insertAfter(ertek)
    HA isEmpty() VAGY isLast() AKKOR insertLast(ertek)
    KÜLÖNBEN
        stepForward()
        insertBefore(ertek)
    */
    public void insertAfter(int value) {
        if (isEmpty() || isLast()){
            insertLast(value);
        } else {
            stepForeward();
            insertBefore(value);
        }
    }
    /*
    removeFirst()
    HA ¬isEmpty() AKKOR
        HA isFirst() AKKOR Akt <- Head.Kovetkezo
                           Head <- Head.Kovetkezo
        HA Head != null AKKOR Head.Elozo <- null
                        KÜLÖNBEN
                        Tail <- null
    */
    public void removeFirst() {
        if (!isEmpty()){
            if(isFirst()){
               actualNode = head.nextNode;
               head = head.nextNode;
            }
            if (head != null){
                head.previousNode = null;
            } else {
                tail = null;
            }
        }
    }
    /*
    removeLast()
    HA ¬isEmpty() AKKOR
        HA Tail==Head AKKOR removeFirst(); VÉGE
        HA isLast() AKKOR Akt <- Tail.Elozo
                                 Tail <- Tail.Elozo
                                 Tail.Kovetkezo <- null
     */
    public void removeLast() {
        if (!isEmpty()){
            if(tail == head){
                removeFirst();
            }
            if(isLast()){
               actualNode = tail.previousNode;
               tail = tail.previousNode;
               tail.nextNode = null;
            }
        }
    }
    /*
    removeActual()
    HA ¬isEmpty() AKKOR
    HA isFirst() AKKOR removeFirst(); VÉGE
    HA isLast() AKKOR removeLast(); VÉGE
    Akt.Elozo.Kovektkezo <- Akt.Kovektezo
    Akt.Kovetkezo.Elozo <- Akt.Elozo
    Akt <- Akt.Kovetkezo
     */
    public void removeActual() {
        if (!isEmpty()){
            if (isFirst()){
                removeFirst();
            }
            if (isLast()){
                removeLast();
            }
            actualNode.previousNode.nextNode = actualNode.nextNode;
            actualNode.nextNode.previousNode = actualNode.previousNode;
            actualNode = actualNode.nextNode;
        }
    }

    public boolean contains(int searchValue) {
        if (!isEmpty()) {
            actualNode = head;
            do {
                if (actualNode.value == searchValue) {
                    return true;
                }
                actualNode = actualNode.nextNode;
            } while (!isLast());
        }
        return false;
    }

    public String toString() {
        if (!isEmpty()) {
            StringBuilder temp = new StringBuilder();
            temp.append("[");
            actualNode = head;
            while (!isLast()) {
                temp.append(actualNode.value).append(", ");
                actualNode = actualNode.nextNode;
            }
            temp.append(actualNode.value).append("]");
            return temp.toString();
        }
        return "";
    }

    public int getSize() {
        if (!isEmpty()) {
            actualNode = head;
            while (!isLast()) {
                size++;
                actualNode = actualNode.nextNode;
            }
            size++;
            return size;
        }
        return 0;
    }

}

}