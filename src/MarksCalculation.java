import java.rmi.*;
import java.util.ArrayList;

public interface MarksCalculation extends Remote
{
	public double CalculateMarks(ArrayList <String> StudentAnswer)throws RemoteException;
	public ArrayList<String> Question (String a) throws RemoteException;
	public byte[] downloadFile(String fileName)throws RemoteException;
}
