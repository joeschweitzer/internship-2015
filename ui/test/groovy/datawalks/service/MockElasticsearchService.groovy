package datawalks.service

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

import datawalks.service.ElasticsearchService

@Service("esService")
@Profile("mock")
class MockElasticsearchService {

	def search(params = [:]) {
		[[uname: 'joe', date: 1436848332489, text: 'Mock tweet', handle: 'joe', img: null]]
	}
}