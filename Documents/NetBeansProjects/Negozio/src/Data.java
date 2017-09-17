


    public class Data
{
  private int giorno;
  private int mese;
  private int anno;
  
  public Data(int giorno,int mese,int anno)
  {
    this.giorno=giorno;
    this.mese=mese;
    this.anno=anno;
  }
  public void setGiorno(int giorno)
  {
    this.giorno=giorno;
  }
  public void setMese(int mese)
  {
    this.mese=mese;
  }
  public void setAnno(int anno)
  {
   this.anno=anno;
  }
  public int getGiorno()
  {
    return this.giorno;
  }
  public int getmese()
  {
    return this.mese;
  }
  public int getAnno()
  {
    return this.anno;
  }
  public void nextDay()
  {
    if(this.giorno<30)
    {
      this.giorno++;
    }
    else
    {
      this.giorno = 1;
      if(this.mese<12)
      {
        this.mese++;
      }
      else
      {
        this.mese=1;
        this.anno++;


      }
    }
  }
  public String toString()
  {
    String data= giorno + "/"+ mese + "/"+anno;
    return data;
  }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Data other = (Data) obj;
        if (this.giorno != other.giorno) {
            return false;
        }
        if (this.mese != other.mese) {
            return false;
        }
        if (this.anno != other.anno) {
            return false;
        }
        return true;
        
        
    }
public int getDifference(Data data)
{
  // 24.12.2003 e 28.12.2003  (2003*365) +(30*11)+28 -> (anni*365)+(30*(mesi-1))+giorni
    int data2=(data.getAnno()*365)+(30*(data.getmese()-1))+data.getGiorno(); //3100
    int data1=(this.getAnno()*365)+(30*(this.getmese()-1))+this.getGiorno(); //3000
    int differenza=data2-data1;
    return differenza;
}

}
