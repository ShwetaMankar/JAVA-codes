import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*; // Although JTree is packed in javax.swing. 
									// its support classes & interfaces are packed in javax.swing.tree.
class pr7Ex extends JFrame
{
	pr7Ex()
	{
		
		DefaultMutableTreeNode c = new DefaultMutableTreeNode("c");
		
		DefaultMutableTreeNode users = new DefaultMutableTreeNode("Users");
		
		DefaultMutableTreeNode Default = new DefaultMutableTreeNode("Default");
		DefaultMutableTreeNode Public = new DefaultMutableTreeNode("Public");
		DefaultMutableTreeNode Shweta = new DefaultMutableTreeNode("Shweta");
		
		DefaultMutableTreeNode AppData = new DefaultMutableTreeNode("AppData");
		DefaultMutableTreeNode Desktop = new DefaultMutableTreeNode("Desktop");
		DefaultMutableTreeNode Documents = new DefaultMutableTreeNode("Documents");
		DefaultMutableTreeNode Downloads = new DefaultMutableTreeNode("Downloads");
		DefaultMutableTreeNode Favorites = new DefaultMutableTreeNode("Favorites");
		DefaultMutableTreeNode Links = new DefaultMutableTreeNode("Links");
		DefaultMutableTreeNode Music = new DefaultMutableTreeNode("Music");
		DefaultMutableTreeNode OneDrive = new DefaultMutableTreeNode("OneDrive");
		DefaultMutableTreeNode Pictures = new DefaultMutableTreeNode("Pictures");
		DefaultMutableTreeNode SavedGames = new DefaultMutableTreeNode("Saved games");
		DefaultMutableTreeNode Vedios = new DefaultMutableTreeNode("Vedios");
		DefaultMutableTreeNode NTUSERS = new DefaultMutableTreeNode("NTUSERS");
		
		DefaultMutableTreeNode Libraries = new DefaultMutableTreeNode("Libraries");
		
		DefaultMutableTreeNode Contacts = new DefaultMutableTreeNode("Contacts");
		
		Default.add(AppData);
		Default.add(Desktop);
		Default.add(Documents);
		Default.add(Downloads);
		Default.add(Favorites);
		Default.add(Links);
		Default.add(Music);
		Default.add(OneDrive);
		Default.add(Pictures);
		Default.add(SavedGames);
		Default.add(Vedios);
		Default.add(NTUSERS);
		
		Public.add(Libraries);
		
		Shweta.add(Contacts);
		
		users.add(Default);
		users.add(Public);
		users.add(Shweta);
		
		c.add(users);
		
		JTree jt = new JTree(c);
		add(jt);
		
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
		setTitle("Use of JTree");
	}
	
	public static void main(String s[])
	{
		new pr7Ex();
	}
}