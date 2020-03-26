// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnGentableClearRequestVer13 implements OFBsnGentableClearRequest {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnGentableClearRequestVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 52;

        private final static long DEFAULT_XID = 0x0L;
        private final static U128 DEFAULT_CHECKSUM = U128.ZERO;
        private final static U128 DEFAULT_CHECKSUM_MASK = U128.ZERO;

    // OF message fields
    private final long xid;
    private final GenTableId tableId;
    private final U128 checksum;
    private final U128 checksumMask;
//

    // package private constructor - used by readers, builders, and factory
    OFBsnGentableClearRequestVer13(long xid, GenTableId tableId, U128 checksum, U128 checksumMask) {
        if(tableId == null) {
            throw new NullPointerException("OFBsnGentableClearRequestVer13: property tableId cannot be null");
        }
        if(checksum == null) {
            throw new NullPointerException("OFBsnGentableClearRequestVer13: property checksum cannot be null");
        }
        if(checksumMask == null) {
            throw new NullPointerException("OFBsnGentableClearRequestVer13: property checksumMask cannot be null");
        }
        this.xid = xid;
        this.tableId = tableId;
        this.checksum = checksum;
        this.checksumMask = checksumMask;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x30L;
    }

    @Override
    public GenTableId getTableId() {
        return tableId;
    }

    @Override
    public U128 getChecksum() {
        return checksum;
    }

    @Override
    public U128 getChecksumMask() {
        return checksumMask;
    }



    public OFBsnGentableClearRequest.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnGentableClearRequest.Builder {
        final OFBsnGentableClearRequestVer13 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean tableIdSet;
        private GenTableId tableId;
        private boolean checksumSet;
        private U128 checksum;
        private boolean checksumMaskSet;
        private U128 checksumMask;

        BuilderWithParent(OFBsnGentableClearRequestVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnGentableClearRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x30L;
    }

    @Override
    public GenTableId getTableId() {
        return tableId;
    }

    @Override
    public OFBsnGentableClearRequest.Builder setTableId(GenTableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public U128 getChecksum() {
        return checksum;
    }

    @Override
    public OFBsnGentableClearRequest.Builder setChecksum(U128 checksum) {
        this.checksum = checksum;
        this.checksumSet = true;
        return this;
    }
    @Override
    public U128 getChecksumMask() {
        return checksumMask;
    }

    @Override
    public OFBsnGentableClearRequest.Builder setChecksumMask(U128 checksumMask) {
        this.checksumMask = checksumMask;
        this.checksumMaskSet = true;
        return this;
    }


        @Override
        public OFBsnGentableClearRequest build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                GenTableId tableId = this.tableIdSet ? this.tableId : parentMessage.tableId;
                if(tableId == null)
                    throw new NullPointerException("Property tableId must not be null");
                U128 checksum = this.checksumSet ? this.checksum : parentMessage.checksum;
                if(checksum == null)
                    throw new NullPointerException("Property checksum must not be null");
                U128 checksumMask = this.checksumMaskSet ? this.checksumMask : parentMessage.checksumMask;
                if(checksumMask == null)
                    throw new NullPointerException("Property checksumMask must not be null");

                //
                return new OFBsnGentableClearRequestVer13(
                    xid,
                    tableId,
                    checksum,
                    checksumMask
                );
        }

    }

    static class Builder implements OFBsnGentableClearRequest.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean tableIdSet;
        private GenTableId tableId;
        private boolean checksumSet;
        private U128 checksum;
        private boolean checksumMaskSet;
        private U128 checksumMask;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnGentableClearRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x30L;
    }

    @Override
    public GenTableId getTableId() {
        return tableId;
    }

    @Override
    public OFBsnGentableClearRequest.Builder setTableId(GenTableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public U128 getChecksum() {
        return checksum;
    }

    @Override
    public OFBsnGentableClearRequest.Builder setChecksum(U128 checksum) {
        this.checksum = checksum;
        this.checksumSet = true;
        return this;
    }
    @Override
    public U128 getChecksumMask() {
        return checksumMask;
    }

    @Override
    public OFBsnGentableClearRequest.Builder setChecksumMask(U128 checksumMask) {
        this.checksumMask = checksumMask;
        this.checksumMaskSet = true;
        return this;
    }
//
        @Override
        public OFBsnGentableClearRequest build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            if(!this.tableIdSet)
                throw new IllegalStateException("Property tableId doesn't have default value -- must be set");
            if(tableId == null)
                throw new NullPointerException("Property tableId must not be null");
            U128 checksum = this.checksumSet ? this.checksum : DEFAULT_CHECKSUM;
            if(checksum == null)
                throw new NullPointerException("Property checksum must not be null");
            U128 checksumMask = this.checksumMaskSet ? this.checksumMask : DEFAULT_CHECKSUM_MASK;
            if(checksumMask == null)
                throw new NullPointerException("Property checksumMask must not be null");


            return new OFBsnGentableClearRequestVer13(
                    xid,
                    tableId,
                    checksum,
                    checksumMask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnGentableClearRequest> {
        @Override
        public OFBsnGentableClearRequest readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 4
            byte version = bb.readByte();
            if(version != (byte) 0x4)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_13(4), got="+version);
            // fixed value property type == 4
            byte type = bb.readByte();
            if(type != (byte) 0x4)
                throw new OFParseError("Wrong type: Expected=OFType.EXPERIMENTER(4), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 52)
                throw new OFParseError("Wrong length: Expected=52(52), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property subtype == 0x30L
            int subtype = bb.readInt();
            if(subtype != 0x30)
                throw new OFParseError("Wrong subtype: Expected=0x30L(0x30L), got="+subtype);
            GenTableId tableId = GenTableId.read2Bytes(bb);
            // pad: 2 bytes
            bb.skipBytes(2);
            U128 checksum = U128.read16Bytes(bb);
            U128 checksumMask = U128.read16Bytes(bb);

            OFBsnGentableClearRequestVer13 bsnGentableClearRequestVer13 = new OFBsnGentableClearRequestVer13(
                    xid,
                      tableId,
                      checksum,
                      checksumMask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnGentableClearRequestVer13);
            return bsnGentableClearRequestVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnGentableClearRequestVer13Funnel FUNNEL = new OFBsnGentableClearRequestVer13Funnel();
    static class OFBsnGentableClearRequestVer13Funnel implements Funnel<OFBsnGentableClearRequestVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnGentableClearRequestVer13 message, PrimitiveSink sink) {
            // fixed value property version = 4
            sink.putByte((byte) 0x4);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // fixed value property length = 52
            sink.putShort((short) 0x34);
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x30L
            sink.putInt(0x30);
            message.tableId.putTo(sink);
            // skip pad (2 bytes)
            message.checksum.putTo(sink);
            message.checksumMask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnGentableClearRequestVer13> {
        @Override
        public void write(ByteBuf bb, OFBsnGentableClearRequestVer13 message) {
            // fixed value property version = 4
            bb.writeByte((byte) 0x4);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // fixed value property length = 52
            bb.writeShort((short) 0x34);
            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x30L
            bb.writeInt(0x30);
            message.tableId.write2Bytes(bb);
            // pad: 2 bytes
            bb.writeZero(2);
            message.checksum.write16Bytes(bb);
            message.checksumMask.write16Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnGentableClearRequestVer13(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("tableId=").append(tableId);
        b.append(", ");
        b.append("checksum=").append(checksum);
        b.append(", ");
        b.append("checksumMask=").append(checksumMask);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFBsnGentableClearRequestVer13 other = (OFBsnGentableClearRequestVer13) obj;

        if( xid != other.xid)
            return false;
        if (tableId == null) {
            if (other.tableId != null)
                return false;
        } else if (!tableId.equals(other.tableId))
            return false;
        if (checksum == null) {
            if (other.checksum != null)
                return false;
        } else if (!checksum.equals(other.checksum))
            return false;
        if (checksumMask == null) {
            if (other.checksumMask != null)
                return false;
        } else if (!checksumMask.equals(other.checksumMask))
            return false;
        return true;
    }

    @Override
    public boolean equalsIgnoreXid(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFBsnGentableClearRequestVer13 other = (OFBsnGentableClearRequestVer13) obj;

        // ignore XID
        if (tableId == null) {
            if (other.tableId != null)
                return false;
        } else if (!tableId.equals(other.tableId))
            return false;
        if (checksum == null) {
            if (other.checksum != null)
                return false;
        } else if (!checksum.equals(other.checksum))
            return false;
        if (checksumMask == null) {
            if (other.checksumMask != null)
                return false;
        } else if (!checksumMask.equals(other.checksumMask))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((tableId == null) ? 0 : tableId.hashCode());
        result = prime * result + ((checksum == null) ? 0 : checksum.hashCode());
        result = prime * result + ((checksumMask == null) ? 0 : checksumMask.hashCode());
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + ((tableId == null) ? 0 : tableId.hashCode());
        result = prime * result + ((checksum == null) ? 0 : checksum.hashCode());
        result = prime * result + ((checksumMask == null) ? 0 : checksumMask.hashCode());
        return result;
    }

}
