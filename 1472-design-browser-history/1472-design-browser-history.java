class Node{
    String url;
    Node forward;
    Node back;

    Node(String url){
        this.url=url;
    }
}

class BrowserHistory {

    Node curr;

    public BrowserHistory(String homepage) {
        curr=new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode=new Node(url);
        curr.forward=newNode;
        newNode.back=curr;
        curr=newNode;
    }
    
    public String back(int steps) {
        while(steps>0){
        if(curr.back!=null){
                curr=curr.back;
            }else{
                break;
            }
            steps--;
        }
        return curr.url;
    }
    
    public String forward(int steps) {
        while(steps>0){
            if(curr.forward!=null){
                curr=curr.forward;
            }else{
                break;
            }
            steps--;
        }
        return curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */