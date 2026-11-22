import java.util.ArrayList;

public class PracticeTaskHeap {

   private ArrayList<PracticeTask> heap;

   public PracticeTaskHeap() {
    heap = new ArrayList<>();
   } 

   public int size() {
    return heap.size();
   }

   public boolean isEmpty() {
    return heap.isEmpty();
   }

   public void insert(PracticeTask task) {

    if(task == null){
        throw new IllegalArgumentException("Task cannot be null.");
    }

    heap.add(task);
    }
}
