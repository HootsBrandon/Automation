package messageIntegration;

import java.io.IOException;

import org.testng.annotations.Test;

import baseObjects.SetupAndClose;

public class MIntegration extends SetupAndClose{
	
	@Test(groups= {"Integration"})
	public void Failure() throws IOException {
		

		
	}
	
//	User can filter their messages to only show unread messages
	@Test(groups= {"Integration"})

	
//	User can filter their messages to show all messages (read & unread)
	@Test(groups= {"Integration"})

//	A user can create a new discussion with another user
	@Test(groups= {"Integration"})

//  user1 tries to create a new discussion with user2 but receives an error because user2 does not have permission to message.
	@Test(groups= {"Integration"})

//	user1 and user2 have an existing conversation. user1 can send user2 another message
	@Test(groups= {"Integration"})

//	user1 and user2 have an existing conversation. user2 has lost permission to message. user1 tries to send user2 a message but receives an error.
	@Test(groups= {"Integration"})

//	user can delete discussion.
	@Test(groups= {"Integration"})

//	user can open a discussion and view the messages.
	@Test(groups= {"Integration"})

//	user1 can search their discussions for user2's name. all discussions where user2's name matches the search string are displayed.
	@Test(groups= {"Integration"})

//	user1 can search their discussions for a name but receives no results if there are no discussions with users matching the search string.
	@Test(groups= {"Integration"})

//	user can mark their discussion as read, thus marking all messages in the discussion as read.
	@Test(groups= {"Integration"})

//	user can mark a message as read. if this is the last unread message in the discussion, then the discussion is also marked as read.
	@Test(groups= {"Integration"})

//user receives an error if they attempt to create a discussion with no message
	@Test(groups= {"Integration"})
}
