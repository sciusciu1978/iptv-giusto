
public class Server {
    private String nomeServer;
    private String contattoSocial;

    public Server(String nomeServer, String contattoSocial) {
        this.nomeServer = nomeServer;
        this.contattoSocial = contattoSocial;
    }
    

    public String getNomeServer() {
        return nomeServer;
    }

    public void setNomeServer(String nomeServer) {
        this.nomeServer = nomeServer;
    }

    public String getContattoSocial() {
        return contattoSocial;
    }

    public void setContattoSocial(String contattoSocial) {
        this.contattoSocial = contattoSocial;
    }
    public String toString(){
        return nomeServer+'\n'+"Contatto Social: "+contattoSocial;
    } 
}
