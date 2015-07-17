package datawalks.service

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

import datawalks.service.SqlService

@Service("sqlService")
@Profile("mock")
class MockSqlService {
	
	def getLookupName(){
		[[deviceid: 1, ownerName: 'Joe']]
	}
	
	/* getDatePerDevice()
	 * 
	 * Return the dates per the device
	 */
	def getDatePerDevice(){
		[[devid: 1, dtime: '2015-07-14']]
	}
	
	/* getDevicePoints(long, Date, Date)
	 *
	 * Returns information from the workabledata table, used
	 * for the google heatmap
	 */
	def getDevicePoints(String watchId, Date startDate, Date stopDate) {
		[[deviceid: 1, latitude: '38.93967873416841', longitude: '-77.31460218317807', 
			dtime: 1436848332489, distancemeters: 100]]
	}
	
	/* getTotalDistance(long, Date, Date)
	 * 
	 * Returns the max distance for each day in the table workabledata
	 */
	def getTotalDistance(long watchId, Date startDate, Date stopDate){
		
		[[deviceid: 1, dtime: '2015-07-14', mdistance: 100]]
	}	
	
	/* getDeviceId(long, Date, Date)
	 * 
	 * Returns one column of deviceid's for comparison purposes
	 */
	def getDeviceId(){
		[[device: 1]]
	}
	
	/* getCalorieInfo(long, Date, Date)
	 * 
	 * Returns the Summary information of time and calories from all the runs
	 */
	def getCalorieInfo(long watchId, Date startDate, Date stopDate){
		[[did: 1, dtime: 1436848332489, scal: 100, wrun: 100, sdist: 100, stime: 1436848332489]]
	}
}