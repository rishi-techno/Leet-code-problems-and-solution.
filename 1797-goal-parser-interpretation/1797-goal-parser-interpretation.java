class Solution {
    public String interpret(String command) {
        StringBuilder parser=new StringBuilder();
        int i=0;
        while(i<command.length()){
            if(command.charAt(i)=='G'){
                parser.append('G');
                i++; 
                }
                else if(command.charAt(i)=='('&&command.charAt(i+1)==')')
                {
                    parser.append('o');
                    i=i+2;
                }
                else {
                    parser.append("al");
                    i+=4;
                }
        }
        return parser.toString();
    }
}