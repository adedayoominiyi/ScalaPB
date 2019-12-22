// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor
import _root_.scalapb.internal.compat.JavaConverters._

/** Describes a service.
  */
@SerialVersionUID(0L)
final case class ServiceDescriptorProto(
    name: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    method: _root_.scala.Seq[com.google.protobuf.descriptor.MethodDescriptorProto] = _root_.scala.Seq.empty,
    options: _root_.scala.Option[com.google.protobuf.descriptor.ServiceOptions] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[ServiceDescriptorProto] with scalapb.lenses.Updatable[ServiceDescriptorProto] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (name.isDefined) {
        val __value = name.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      };
      method.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      if (options.isDefined) {
        val __value = options.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      name.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      method.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      options.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.ServiceDescriptorProto = {
      var __name = this.name
      val __method = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.MethodDescriptorProto] ++= this.method)
      var __options = this.options
      var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Option(_input__.readStringRequireUtf8())
          case 18 =>
            __method += _root_.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.MethodDescriptorProto.defaultInstance)
          case 26 =>
            __options = Option(_root_.scalapb.LiteParser.readMessage(_input__, __options.getOrElse(com.google.protobuf.descriptor.ServiceOptions.defaultInstance)))
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(this.unknownFields)
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      com.google.protobuf.descriptor.ServiceDescriptorProto(
          name = __name,
          method = __method.result(),
          options = __options,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
    def getName: _root_.scala.Predef.String = name.getOrElse("")
    def clearName: ServiceDescriptorProto = copy(name = _root_.scala.None)
    def withName(__v: _root_.scala.Predef.String): ServiceDescriptorProto = copy(name = Option(__v))
    def clearMethod = copy(method = _root_.scala.Seq.empty)
    def addMethod(__vs: com.google.protobuf.descriptor.MethodDescriptorProto*): ServiceDescriptorProto = addAllMethod(__vs)
    def addAllMethod(__vs: Iterable[com.google.protobuf.descriptor.MethodDescriptorProto]): ServiceDescriptorProto = copy(method = method ++ __vs)
    def withMethod(__v: _root_.scala.Seq[com.google.protobuf.descriptor.MethodDescriptorProto]): ServiceDescriptorProto = copy(method = __v)
    def getOptions: com.google.protobuf.descriptor.ServiceOptions = options.getOrElse(com.google.protobuf.descriptor.ServiceOptions.defaultInstance)
    def clearOptions: ServiceDescriptorProto = copy(options = _root_.scala.None)
    def withOptions(__v: com.google.protobuf.descriptor.ServiceOptions): ServiceDescriptorProto = copy(options = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => name.orNull
        case 2 => method
        case 3 => options.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => name.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => _root_.scalapb.descriptors.PRepeated(method.iterator.map(_.toPMessage).toVector)
        case 3 => options.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.ServiceDescriptorProto
}

object ServiceDescriptorProto extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.ServiceDescriptorProto] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.ServiceDescriptorProto, com.google.protobuf.DescriptorProtos.ServiceDescriptorProto] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.ServiceDescriptorProto] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.ServiceDescriptorProto, com.google.protobuf.DescriptorProtos.ServiceDescriptorProto] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.ServiceDescriptorProto): com.google.protobuf.DescriptorProtos.ServiceDescriptorProto = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder
    scalaPbSource.name.foreach(javaPbOut.setName)
    javaPbOut.addAllMethod(scalaPbSource.method.iterator.map(com.google.protobuf.descriptor.MethodDescriptorProto.toJavaProto).toIterable.asJava)
    scalaPbSource.options.map(com.google.protobuf.descriptor.ServiceOptions.toJavaProto).foreach(javaPbOut.setOptions)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.ServiceDescriptorProto): com.google.protobuf.descriptor.ServiceDescriptorProto = com.google.protobuf.descriptor.ServiceDescriptorProto(
    name = if (javaPbSource.hasName) Some(javaPbSource.getName) else _root_.scala.None,
    method = javaPbSource.getMethodList.asScala.iterator.map(com.google.protobuf.descriptor.MethodDescriptorProto.fromJavaProto).toSeq,
    options = if (javaPbSource.hasOptions) Some(com.google.protobuf.descriptor.ServiceOptions.fromJavaProto(javaPbSource.getOptions)) else _root_.scala.None
  )
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.ServiceDescriptorProto] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.ServiceDescriptorProto(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        method = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[com.google.protobuf.descriptor.MethodDescriptorProto]]).getOrElse(_root_.scala.Seq.empty),
        options = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.descriptor.ServiceOptions]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(8)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(8)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.descriptor.MethodDescriptorProto
      case 3 => __out = com.google.protobuf.descriptor.ServiceOptions
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.ServiceDescriptorProto(
    name = _root_.scala.None,
    method = _root_.scala.Seq.empty,
    options = _root_.scala.None
  )
  implicit class ServiceDescriptorProtoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.ServiceDescriptorProto]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.ServiceDescriptorProto](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getName)((c_, f_) => c_.copy(name = Option(f_)))
    def optionalName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def method: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.descriptor.MethodDescriptorProto]] = field(_.method)((c_, f_) => c_.copy(method = f_))
    def options: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.ServiceOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = Option(f_)))
    def optionalOptions: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.ServiceOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val METHOD_FIELD_NUMBER = 2
  final val OPTIONS_FIELD_NUMBER = 3
  def of(
    name: _root_.scala.Option[_root_.scala.Predef.String],
    method: _root_.scala.Seq[com.google.protobuf.descriptor.MethodDescriptorProto],
    options: _root_.scala.Option[com.google.protobuf.descriptor.ServiceOptions],
    unknownFields: _root_.scalapb.UnknownFieldSet
  ): _root_.com.google.protobuf.descriptor.ServiceDescriptorProto = _root_.com.google.protobuf.descriptor.ServiceDescriptorProto(
    name,
    method,
    options,
    unknownFields
  )
}
