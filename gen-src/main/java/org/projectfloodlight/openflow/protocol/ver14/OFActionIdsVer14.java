// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver14;

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
import java.util.Set;


public class OFActionIdsVer14 implements OFActionIds {
    public final static OFActionIdsVer14 INSTANCE = new OFActionIdsVer14();




    public OFActionIdBsnChecksum bsnChecksum() {
        return OFActionIdBsnChecksumVer14.INSTANCE;
    }

    public OFActionIdBsnGentable bsnGentable() {
        return OFActionIdBsnGentableVer14.INSTANCE;
    }

    public OFActionIdBsnMirror bsnMirror() {
        return OFActionIdBsnMirrorVer14.INSTANCE;
    }

    public OFActionIdBsnSetTunnelDst bsnSetTunnelDst() {
        return OFActionIdBsnSetTunnelDstVer14.INSTANCE;
    }

    public OFActionIdCircuit circuit() {
        throw new UnsupportedOperationException("OFActionIdCircuit not supported in version 1.4");
    }

    public OFActionIdCopyTtlIn copyTtlIn() {
        return OFActionIdCopyTtlInVer14.INSTANCE;
    }

    public OFActionIdCopyTtlOut copyTtlOut() {
        return OFActionIdCopyTtlOutVer14.INSTANCE;
    }

    public OFActionIdDecMplsTtl decMplsTtl() {
        return OFActionIdDecMplsTtlVer14.INSTANCE;
    }

    public OFActionIdDecNwTtl decNwTtl() {
        return OFActionIdDecNwTtlVer14.INSTANCE;
    }

    public OFActionIdGroup group() {
        return OFActionIdGroupVer14.INSTANCE;
    }

    public OFActionIdNiciraCt niciraCt() {
        return OFActionIdNiciraCtVer14.INSTANCE;
    }

    public OFActionIdNiciraCtClear niciraCtClear() {
        return OFActionIdNiciraCtClearVer14.INSTANCE;
    }

    public OFActionIdNiciraDecTtl niciraDecTtl() {
        return OFActionIdNiciraDecTtlVer14.INSTANCE;
    }

    public OFActionIdNiciraLoad niciraLoad() {
        return OFActionIdNiciraLoadVer14.INSTANCE;
    }

    public OFActionIdNiciraMove niciraMove() {
        return OFActionIdNiciraMoveVer14.INSTANCE;
    }

    public OFActionIdNiciraNat niciraNat() {
        return OFActionIdNiciraNatVer14.INSTANCE;
    }

    public OFActionIdNiciraPopNsh niciraPopNsh() {
        return OFActionIdNiciraPopNshVer14.INSTANCE;
    }

    public OFActionIdNiciraPopQueue niciraPopQueue() {
        return OFActionIdNiciraPopQueueVer14.INSTANCE;
    }

    public OFActionIdNiciraPushNsh niciraPushNsh() {
        return OFActionIdNiciraPushNshVer14.INSTANCE;
    }

    public OFActionIdNiciraResubmit niciraResubmit() {
        return OFActionIdNiciraResubmitVer14.INSTANCE;
    }

    public OFActionIdNiciraResubmitTable niciraResubmitTable() {
        return OFActionIdNiciraResubmitTableVer14.INSTANCE;
    }

    public OFActionIdNiciraSetQueue niciraSetQueue() {
        return OFActionIdNiciraSetQueueVer14.INSTANCE;
    }

    public OFActionIdOfdpaPopCw ofdpaPopCw() {
        throw new UnsupportedOperationException("OFActionIdOfdpaPopCw not supported in version 1.4");
    }

    public OFActionIdOfdpaPopL2Header ofdpaPopL2Header() {
        throw new UnsupportedOperationException("OFActionIdOfdpaPopL2Header not supported in version 1.4");
    }

    public OFActionIdOfdpaPushCw ofdpaPushCw() {
        throw new UnsupportedOperationException("OFActionIdOfdpaPushCw not supported in version 1.4");
    }

    public OFActionIdOfdpaPushL2Header ofdpaPushL2Header() {
        throw new UnsupportedOperationException("OFActionIdOfdpaPushL2Header not supported in version 1.4");
    }

    public OFActionIdOfdpaSetVlanTranslation ofdpaSetVlanTranslation() {
        throw new UnsupportedOperationException("OFActionIdOfdpaSetVlanTranslation not supported in version 1.4");
    }

    public OFActionIdOnfCopyField onfCopyField() {
        throw new UnsupportedOperationException("OFActionIdOnfCopyField not supported in version 1.4");
    }

    public OFActionIdOplinkAtt oplinkAtt() {
        throw new UnsupportedOperationException("OFActionIdOplinkAtt not supported in version 1.4");
    }

    public OFActionIdOutput output() {
        return OFActionIdOutputVer14.INSTANCE;
    }

    public OFActionIdPopMpls popMpls() {
        return OFActionIdPopMplsVer14.INSTANCE;
    }

    public OFActionIdPopPbb popPbb() {
        return OFActionIdPopPbbVer14.INSTANCE;
    }

    public OFActionIdPopVlan popVlan() {
        return OFActionIdPopVlanVer14.INSTANCE;
    }

    public OFActionIdPushMpls pushMpls() {
        return OFActionIdPushMplsVer14.INSTANCE;
    }

    public OFActionIdPushPbb pushPbb() {
        return OFActionIdPushPbbVer14.INSTANCE;
    }

    public OFActionIdPushVlan pushVlan() {
        return OFActionIdPushVlanVer14.INSTANCE;
    }

    public OFActionIdSetField setField() {
        return OFActionIdSetFieldVer14.INSTANCE;
    }

    public OFActionIdSetMplsTtl setMplsTtl() {
        return OFActionIdSetMplsTtlVer14.INSTANCE;
    }

    public OFActionIdSetNwTtl setNwTtl() {
        return OFActionIdSetNwTtlVer14.INSTANCE;
    }

    public OFActionIdSetQueue setQueue() {
        return OFActionIdSetQueueVer14.INSTANCE;
    }

    public OFActionIdMeter meter() {
        throw new UnsupportedOperationException("OFActionIdMeter not supported in version 1.4");
    }

    public OFMessageReader<OFActionId> getReader() {
        return OFActionIdVer14.READER;
    }


    public OFVersion getVersion() {
            return OFVersion.OF_14;
    }
}