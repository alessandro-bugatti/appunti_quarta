package net.imparando;

/**
 * Implementazione di una coda utilizzando un vettore in
 * modo circolare, da completare
 * Qualche appunto qua
 * https://www.nebo.app/page/5b3ef2f5-d9a6-4359-ae5a-8a229b3954f1
 */
public class Coda {
        private final static int MAX = 6;
        private int v[];
        private int head, tail;
        private int quanti;

        public Coda(){
            v = new int[MAX];
        }

        public void push(int n){
            if (quanti == MAX)
                return;
            v[head] = n;
            head++;
            head = head%MAX;
            quanti++;
        }

        public int pop(){
            if (quanti == 0)
                return -1;
            int temp = v[tail];
            tail++;
            tail = tail%MAX;
            quanti--;
            return temp;
        }

        public boolean empty(){
            return quanti == 0;
        }

    }
