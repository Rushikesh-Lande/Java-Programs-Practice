class FindArraySeLaNo{

   public static int lNo(int[] a){//{208,28,8,752,-4,5};

        int l=a.length,fst=a[0],sec=a[1]; //first=45 and sec=7;
        if(sec>fst) {fst=sec; sec=fst;}
        
       for(int i=0;i<l;i++){

         if(a[i]>fst) {sec=fst; fst=a[i]; }
                 
         else if(a[i]<fst&&a[i]>sec) sec=a[i];
}

      return sec;
}

}