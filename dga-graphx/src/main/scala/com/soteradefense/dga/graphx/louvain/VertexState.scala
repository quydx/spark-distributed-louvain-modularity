package com.soteradefense.dga.graphx.louvain

/**
 * Louvain vertex state
 * Contains all information needed for louvain community detection
 */
class VertexState extends Serializable{

  var community = -1L
  var communitySigmaTot = 0F
  var internalWeight = 0F  // self edges
  var nodeWeight = 0F;  //out degree
  var changed = false
   
  override def toString(): String = {
    "{community:"+community+",communitySigmaTot:"+communitySigmaTot+
    ",internalWeight:"+internalWeight+",nodeWeight:"+nodeWeight+"}"
  }
}