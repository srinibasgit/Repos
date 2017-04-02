package hashcode.performance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * http://java-performance.info/hashcode-method-performance-tuning/ 
 * @author spanda
 *
 */
public class HashCodePerformance {

	public static void main(String[] args) {
		List<SlowString> slowList = new ArrayList<>();
		List<String> list = new ArrayList<>();
		for(int i=0; i<10000; i++){
			slowList.add(new SlowString("ABCD" + i));
			list.add("ABCD" + i);
		}
		
		testMapSpeed(slowList, "SlowString");
		testMapSpeed(list, "String");

	}

	private static void testMapSpeed( final List lst, final String name )
	{
	    final Map<Object, Object> map = new HashMap<Object, Object>( lst.size() );
	    int cnt = 0;
	    final long start = System.currentTimeMillis();
	    for ( final Object obj : lst )
	    {
	        map.put( obj, obj );
	        if ( map.containsKey( obj ) )
	            ++cnt;
	    }
	    final long time = System.currentTimeMillis() - start;
	    System.out.println( "Time for "  + name + " is " + time / 1000.0 + " sec, cnt = " + cnt );
	}
	
}


class SlowString
{
    public final String m_str;
 
    public SlowString( final String str ) {
        this.m_str = str;
    }
 
    @Override
    public int hashCode() {
        return 37;
    }
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final SlowString that = ( SlowString ) o;
        return !(m_str != null ? !m_str.equals(that.m_str) : that.m_str != null);
    }
}