public class AssignCookies {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int count=0;
            for(int j=0;count<g.length && j<s.length;j++){
                
                    if(s[j]>=g[count]){
                        count++;
                    }
            }
            return count;
        }
    }
