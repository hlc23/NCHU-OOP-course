import java.util.ArrayList;
import java.util.Arrays;

class Set {
    private int[] elements;

    public Set(int... args) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int num : args) {
            if (!temp.contains(num)) {
                temp.add(num);
            }
        }
        elements = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            elements[i] = temp.get(i);
        }
        sort();
    }

    public void add(int arg) {
        for (int e : elements) {
            if (e == arg) {
                return;
            }
        }
        int[] newElements = Arrays.copyOf(elements, elements.length + 1);
        newElements[elements.length] = arg;
        elements = newElements;
        sort();
    }

    public void remove(int arg) {
        int count = 0;
        for (int e : elements) {
            if (e == arg) {
                count++;
            }
        }
        if (count == 0) return;

        int[] newElements = new int[elements.length - count];
        int index = 0;
        for (int e : elements) {
            if (e != arg) {
                newElements[index++] = e;
            }
        }
        elements = newElements;
    }

    public void intersection(Set set) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int e : elements) {
            for (int s : set.elements) {
                if (e == s) {
                    result.add(e);
                    break;
                }
            }
        }
        elements = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            elements[i] = result.get(i);
        }
        sort();
    }

    public void union(Set set) {
        for (int s : set.elements) {
            add(s);
        }
        sort();
    }
   

  	// You don't need to modify the following code
    public void ShowElements() {
        System.out.print("{");
        for (int i = 0; i < elements.length - 1; i++) {
            System.out.print(elements[i] + ",");
        }
        System.out.println(elements[elements.length - 1] + "}");
    }

    private void sort() {
        for (int i = 0; i < elements.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < elements[minIdx]) {
                    minIdx = j;
                }
            }
            int tmp = elements[i];
            elements[i] = elements[minIdx];
            elements[minIdx] = tmp;
        }
    }
}
