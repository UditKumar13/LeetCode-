ArrayList <meeting> meet = new ArrayList<>() ; 
        
      for (int i =0 ; i < start.length ; i++){
        meet.add(new meeting(start[i],end[i],i+1)) ;
      }
      
      meeting_Comparator mc = new meeting_Comparator() ; 
      Collections.sort(meet,mc) ; // sorting the arraylist wrt to the end time and pos time
      
      ArrayList <Integer> ans = new ArrayList<>() ;
      ans.add(meet.get(0).pos) ;
      
      int limit = meet.get(0).end ;
      
      for(int i = 1 ; i<start.length ; i++){
        if(meet.get(i).start > limit){
          ans.add(meet.get(i).pos);
          limit = meet.get(i).end ; 
        }
      }
      
      return ans.size() ; 