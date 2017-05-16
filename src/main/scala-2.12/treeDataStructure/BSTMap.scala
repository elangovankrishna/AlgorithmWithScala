package treeDataStructure

import scala.collection.mutable
/**
  * Created by ke20506 on 3/14/2017.
  */
class BSTMap[K, V](comp:(K,K) => Int) extends mutable.Map[K, V]{
  class Node(var Key:K, var value:V, var left:Node, var right: Node)

  private var root: Node = null

  def +=(kv: (K,V)) = {

    def recur(n:Node):Node = {

    }
    root = recur(root)
    this
  }

  def -=(kv: (K, V)) = {
    this
  }

  def get(key: K): Option[V] = {
    var rover = root
    var c = if(rover!=null) comp(key,rover.Key) else 0
    while (rover != null && c!=0 ) {
      rover = if(c<0) rover.left
      else rover.right
      c = if(rover!=null) comp(key,rover.Key) else 0
    }
    if(rover ==null) None else Some(rover.value)
  }

  def iterator = new Iterator[(K, V)] {
    def next = null
    def hasNext = false
  }
}

  **/