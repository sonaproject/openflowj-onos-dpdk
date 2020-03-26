// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template unit_test.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.stat.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.oxs.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.util.List;
import com.google.common.collect.ImmutableList;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.hamcrest.CoreMatchers;



public class OFGroupModifyVer13Test {
    OFFactory factory;

    final static byte[] GROUP_MODIFY_SERIALIZED =
        new byte[] { 0x4, 0xf, 0x0, 0x70, 0x12, 0x34, 0x56, 0x78, 0x0, 0x1, 0x3, 0x0, 0x0, 0x0, 0x0, 0x5, 0x0, 0x30, 0x0, 0x1, 0x0, 0x0, 0x0, 0x5, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x10, 0x0, 0x0, 0x0, 0x5, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x10, 0x0, 0x0, 0x0, 0x6, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x30, 0x0, 0x1, 0x0, 0x0, 0x0, 0x6, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x10, 0x0, 0x0, 0x0, 0x5, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x10, 0x0, 0x0, 0x0, 0x6, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 };

    @Before
    public void setup() {
        factory = OFFactoryVer13.INSTANCE;
    }

    @Test
    public void testWrite() {
        OFGroupModify.Builder builder = factory.buildGroupModify();
            OFActions actions = factory.actions();
    builder
      .setXid(0x12345678)
      .setGroupType(OFGroupType.FF)
      .setGroup(OFGroup.of(5))
      .setBuckets(ImmutableList.<OFBucket>of(
        factory.buildBucket()
          .setWeight(1)
          .setWatchPort(OFPort.of(5))
          .setWatchGroup(OFGroup.ANY)
          .setActions(ImmutableList.<OFAction>of(
            actions.output(OFPort.of(5), 0),
            actions.output(OFPort.of(6), 0)
          ))
          .build(),
        factory.buildBucket()
          .setWeight(1)
          .setWatchPort(OFPort.of(6))
          .setWatchGroup(OFGroup.ANY)
          .setActions(ImmutableList.<OFAction>of(
            actions.output(OFPort.of(5), 0),
            actions.output(OFPort.of(6), 0)
          ))
          .build()
         )
      )
      .build();;
        OFGroupModify groupModify = builder.build();
        ByteBuf bb = Unpooled.buffer();
        groupModify.writeTo(bb);
        byte[] written = new byte[bb.readableBytes()];
        bb.readBytes(written);

        assertThat(written, CoreMatchers.equalTo(GROUP_MODIFY_SERIALIZED));
    }

    @Test
    public void testRead() throws Exception {
        OFGroupModify.Builder builder = factory.buildGroupModify();
            OFActions actions = factory.actions();
    builder
      .setXid(0x12345678)
      .setGroupType(OFGroupType.FF)
      .setGroup(OFGroup.of(5))
      .setBuckets(ImmutableList.<OFBucket>of(
        factory.buildBucket()
          .setWeight(1)
          .setWatchPort(OFPort.of(5))
          .setWatchGroup(OFGroup.ANY)
          .setActions(ImmutableList.<OFAction>of(
            actions.output(OFPort.of(5), 0),
            actions.output(OFPort.of(6), 0)
          ))
          .build(),
        factory.buildBucket()
          .setWeight(1)
          .setWatchPort(OFPort.of(6))
          .setWatchGroup(OFGroup.ANY)
          .setActions(ImmutableList.<OFAction>of(
            actions.output(OFPort.of(5), 0),
            actions.output(OFPort.of(6), 0)
          ))
          .build()
         )
      )
      .build();;
        OFGroupModify groupModifyBuilt = builder.build();

        ByteBuf input = Unpooled.copiedBuffer(GROUP_MODIFY_SERIALIZED);

        // FIXME should invoke the overall reader once implemented
        OFGroupModify groupModifyRead = OFGroupModifyVer13.READER.readFrom(input);
        assertEquals(GROUP_MODIFY_SERIALIZED.length, input.readerIndex());

        assertEquals(groupModifyBuilt, groupModifyRead);
   }

   @Test
   public void testReadWrite() throws Exception {
       ByteBuf input = Unpooled.copiedBuffer(GROUP_MODIFY_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFGroupModify groupModify = OFGroupModifyVer13.READER.readFrom(input);
       assertEquals(GROUP_MODIFY_SERIALIZED.length, input.readerIndex());

       // write message again
       ByteBuf bb = Unpooled.buffer();
       groupModify.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(GROUP_MODIFY_SERIALIZED));
   }

}