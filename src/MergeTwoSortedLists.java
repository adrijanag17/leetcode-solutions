public class MergeTwoSortedLists {

    public static ListNode mergeTwoSortedLists(ListNode list1, ListNode list2){
        //using a dummy node
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        // if both are non null
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            } else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // if one list ends before other
        if (list1 != null){
            tail.next = list1;
        } else{
            tail.next = list2;
        }
        return dummy.next;
    }       // T:O(m+n) S:O(1)

    public static ListNode mergeTwoSortedLists2(ListNode list1, ListNode list2){

        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val <= list2.val){
            list1.next = mergeTwoSortedLists2(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoSortedLists2(list1, list2.next);
            return list2;
        }
    }       // T:O(m+n) S:O(1)
}
