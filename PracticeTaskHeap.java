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
    heapifyUp(heap.size() -1);
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;

            if(heap.get(index).getPriority() <= heap.get(parentIndex).getPriority()) {
                break;
            }

            PracticeTask temp = heap.get(index);
            heap.set(index, heap.get(parentIndex));
            heap.set(parentIndex, temp);

            index = parentIndex;
        }
    }
    
    public PracticeTask peek() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty.");
        }
        return heap.get(0);
    }

    public PracticeTask extractMax() {
        if(heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty.");
        }

        PracticeTask maxTask = heap.get(0);

        PracticeTask lastTask = heap.remove(heap.size() - 1);

        if(!heap.isEmpty()) {
            heap.set(0, lastTask);
        }
        return maxTask;
    }
}
