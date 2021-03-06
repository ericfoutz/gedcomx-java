package org.familysearch.platform.ct;

import org.gedcomx.common.URI;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MatchInfoTest {

  @Test
  public void testMatchInfo() throws Exception {

    MatchInfo matchInfo = new MatchInfo();
    assertNull(matchInfo.getCollection());
    assertNull(matchInfo.getStatus());
    assertNull(matchInfo.getAddsPerson());
    assertNull(matchInfo.getAddsFact());
    assertNull(matchInfo.getAddsDateOrPlace());

    matchInfo.setKnownCollection(MatchCollection.tree);
    matchInfo.setKnownStatus(MatchStatus.Accepted);
    matchInfo.setAddsPerson(true);
    matchInfo.setAddsFact(true);
    matchInfo.setAddsDateOrPlace(true);

    assertEquals(MatchCollection.tree.toQNameURI(), matchInfo.getCollection());
    assertEquals(MatchStatus.Accepted.toQNameURI(), matchInfo.getStatus());
    assertTrue(matchInfo.getAddsPerson());
    assertTrue(matchInfo.getAddsFact());
    assertTrue(matchInfo.getAddsDateOrPlace());
  }

}
