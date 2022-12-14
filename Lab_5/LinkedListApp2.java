package Lab_5;
class LinkList2App
   {
   public static void main(String[] args)
      {
      LinkList theList = new LinkList();  // make list

      theList.insertFirst(22);      // insert 4 items
      theList.insertFirst(44);
      theList.insertFirst(66);
      theList.insertFirst(88);
      theList.displayList();              // display list
      theList.deleteLast();
      theList.displayList();
      theList.deleteFirst();
      theList.displayList();
      theList.insertLast(33);
      theList.displayList();
      theList.insertFirst(80);
      theList.insertFirst(88);
      theList.displayList();
    
      theList.displayList();              // display list

      Node f = theList.find(88);          // find item
      if( f != null)
         System.out.println("Found link with key " + f.getData());
      else
         System.out.println("Can't find link");

      Node d = theList.delete(66);        // delete item
      if( d != null )
         System.out.println("Deleted link with key " + d.getData());
      else
        System.out.println("Can't delete link");

      
      }  // end main()
   }  // end class LinkList2App
