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
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.hamcrest.CoreMatchers;



public class OFInstructionBsnDisableSrcMacCheckVer13Test {
    OFInstructions factory;

    final static byte[] INSTRUCTION_BSN_DISABLE_SRC_MAC_CHECK_SERIALIZED =
        new byte[] { (byte) 0xff, (byte) 0xff, 0x0, 0x10, 0x0, 0x5c, 0x16, (byte) 0xc7, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0 };

    @Before
    public void setup() {
        factory = OFInstructionsVer13.INSTANCE;
    }

    @Test
    public void testWrite() {
        OFInstructionBsnDisableSrcMacCheck instructionBsnDisableSrcMacCheck = factory.bsnDisableSrcMacCheck();
        ByteBuf bb = Unpooled.buffer();
        instructionBsnDisableSrcMacCheck.writeTo(bb);
        byte[] written = new byte[bb.readableBytes()];
        bb.readBytes(written);

        assertThat(written, CoreMatchers.equalTo(INSTRUCTION_BSN_DISABLE_SRC_MAC_CHECK_SERIALIZED));
    }

    @Test
    public void testRead() throws Exception {
        OFInstructionBsnDisableSrcMacCheck instructionBsnDisableSrcMacCheckBuilt = factory.bsnDisableSrcMacCheck();

        ByteBuf input = Unpooled.copiedBuffer(INSTRUCTION_BSN_DISABLE_SRC_MAC_CHECK_SERIALIZED);

        // FIXME should invoke the overall reader once implemented
        OFInstructionBsnDisableSrcMacCheck instructionBsnDisableSrcMacCheckRead = OFInstructionBsnDisableSrcMacCheckVer13.READER.readFrom(input);
        assertEquals(INSTRUCTION_BSN_DISABLE_SRC_MAC_CHECK_SERIALIZED.length, input.readerIndex());

        assertEquals(instructionBsnDisableSrcMacCheckBuilt, instructionBsnDisableSrcMacCheckRead);
   }

   @Test
   public void testReadWrite() throws Exception {
       ByteBuf input = Unpooled.copiedBuffer(INSTRUCTION_BSN_DISABLE_SRC_MAC_CHECK_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFInstructionBsnDisableSrcMacCheck instructionBsnDisableSrcMacCheck = OFInstructionBsnDisableSrcMacCheckVer13.READER.readFrom(input);
       assertEquals(INSTRUCTION_BSN_DISABLE_SRC_MAC_CHECK_SERIALIZED.length, input.readerIndex());

       // write message again
       ByteBuf bb = Unpooled.buffer();
       instructionBsnDisableSrcMacCheck.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(INSTRUCTION_BSN_DISABLE_SRC_MAC_CHECK_SERIALIZED));
   }

}
